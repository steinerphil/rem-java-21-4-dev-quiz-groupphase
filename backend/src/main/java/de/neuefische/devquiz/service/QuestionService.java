package de.neuefische.devquiz.service;

import de.neuefische.devquiz.model.Answer;
import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.neuefische.devquiz.service.IdService;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepo questionRepo;
    private final IdService idService = new IdService();

    @Autowired
    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    public Question addQuestion(Question newQuestion){
            //TODO Return List of Questions
            //TODO Set Answer ID´s before saving the question

            newQuestion.setId(idService.generateId());

            for (Answer answer : newQuestion.getAnswers()) {
                answer.setId(idService.generateId());
            }

        return questionRepo.save(newQuestion);
    }


    public Question get(String id) {
        Optional<Question> optionalQuestion = questionRepo.findById(id);

        if (optionalQuestion.isEmpty()) {
            throw new NoSuchElementException("Question with id:" + id + " not found!");
        }
        return optionalQuestion.get();
    }
}
