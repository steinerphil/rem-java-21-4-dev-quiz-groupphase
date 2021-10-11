package de.neuefische.devquiz.controller;

import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DevQuizController {

    QuestionService service;

    @Autowired
    public DevQuizController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/question")
    public List<Question> getAllQuestions(){
        return service.getAllQuestions();
    }

    @PostMapping("/question")
    public Question addQuestion(@RequestBody Question newQuestion){
        return service.addQuestion(newQuestion);
    }
}
