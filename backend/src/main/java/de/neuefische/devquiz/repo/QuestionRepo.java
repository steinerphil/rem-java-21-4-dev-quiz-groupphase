package de.neuefische.devquiz.repo;

import de.neuefische.devquiz.model.Question;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class QuestionRepo {

    private final Map <String, Question> questions = new HashMap<>();

    public List<Question> getAllQuestions() {
        return List.copyOf(questions.values());
    }

    public Question get(String id) {
        //TODO Optional
        return this.questions.get(id);
    }

    public Question addQuestion(Question newQuestion) {
        //TODO Return List of Questions
        if(newQuestion.getId() == null){
            newQuestion.setId(UUID.randomUUID().toString());
            questions.put(newQuestion.getId(), newQuestion);
        }else{
            questions.put(newQuestion.getId(), newQuestion);
        }
        return newQuestion;
    }

}
