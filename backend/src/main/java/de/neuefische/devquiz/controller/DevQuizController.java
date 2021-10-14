package de.neuefische.devquiz.controller;

import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class DevQuizController {

    private final QuestionService questionService;

    @Autowired
    public DevQuizController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping()
    public List<Question> listQuestion() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Question get(@PathVariable String id) {
        return questionService.get(id);
    }

    @PostMapping()
    public Question addQuestion(@RequestBody Question newQuestion) {
        return questionService.addQuestion(newQuestion);
    }
}
