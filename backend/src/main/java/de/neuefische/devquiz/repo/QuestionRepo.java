package de.neuefische.devquiz.repo;

import de.neuefische.devquiz.model.Question;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class QuestionRepo {

    private final Map <String, Question> questions = new HashMap<>();

    public List<Question> listQuestions() {
        return List.copyOf(questions.values());
    }

    public Question get(String id) {
        return this.questions.get(id);
    }

    public Question addQuestion(Question newQuestion) {
        questions.put(newQuestion.getId(), newQuestion);
        return newQuestion;
    }

}
