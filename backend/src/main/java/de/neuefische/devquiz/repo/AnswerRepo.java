package de.neuefische.devquiz.repo;

import de.neuefische.devquiz.model.Answer;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AnswerRepo {

    private final Map<String, Answer> answers = new HashMap<>();

    public AnswerRepo(List<Answer> answers) {
        for (Answer answer : answers) {
            this.answers.put(answer.getId(), answer);
        }
    }

    public List<Answer> listAnswers() {
        return List.copyOf(answers.values());
    }

    public Answer get(String id) {
        return this.answers.get(id);
    }

    public Answer addAnswer(Answer newAnswer) {
        answers.put(newAnswer.getId(), newAnswer);
        return newAnswer;
    }

}

