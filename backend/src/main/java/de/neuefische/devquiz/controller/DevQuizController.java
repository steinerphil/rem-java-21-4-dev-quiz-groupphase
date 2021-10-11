package de.neuefische.devquiz.controller;

import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DevQuizController {

    QuestionService service;

    @Autowired
    public DevQuizController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/api/question")
    public List<Question> getAllQuestions(){
        return service.getAllQuestions();
    }

    @PostMapping("/api/question")
    public Question addQuestion(@RequestBody Question newQuestion){
        return service.addQuestion(newQuestion);
    }
}
