package de.neuefische.devquiz.repo;

import de.neuefische.devquiz.model.Answer;
import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.service.IdService;
import org.springframework.stereotype.Repository;


import java.util.*;

@Repository
public class QuestionRepo {

    private final Map<String, Question> questions = new HashMap<>();
    private final IdService idService;

    public QuestionRepo(IdService idService) {
        this.idService = idService;
    }

    public List<Question> getAllQuestions() {
        return List.copyOf(questions.values());
    }


    public Optional<Question> get(String id) {
        return Optional.of(questions.get(id));
    }

    public Question addQuestion(Question newQuestion) {
        //TODO Return List of Questions
        //TODO Set Answer ID´s before saving the question

        newQuestion.setId(idService.generateId());

        for (Answer answer : newQuestion.getAnswers()) {
            answer.setId(idService.generateId());
        }

        questions.put(newQuestion.getId(), newQuestion);
        return newQuestion;
    }

    public void clear() {
        questions.clear();
    }


}
