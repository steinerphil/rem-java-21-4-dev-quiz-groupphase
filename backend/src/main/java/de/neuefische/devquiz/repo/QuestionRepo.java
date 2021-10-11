package de.neuefische.devquiz.repo;

import de.neuefische.devquiz.model.Question;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class QuestionRepo {

    private final Map<String, Question> questions = new HashMap<>();

    public List<Question> listQuestions() {
        return List.copyOf(questions.values());
    }

    public Optional<Question> get(String id) {
        return Optional.of(questions.get(id));
    }

    public Question addQuestion(Question newQuestion) {
        if (newQuestion.getId() == null) {
            newQuestion.setId(randomId());
        }
        questions.put(newQuestion.getId(), newQuestion);
        return newQuestion;
    }

    public String randomId() {
        return UUID.randomUUID().toString();
    }

    public void clear() {
        questions.clear();
    }


}
