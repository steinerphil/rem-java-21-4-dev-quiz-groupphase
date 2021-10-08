package de.neuefische.devquiz.repo;

import de.neuefische.devquiz.model.Answer;
import de.neuefische.devquiz.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

class QuestionRepoTest {

    @Test
    void listQuestions() {
        // GIVEN
        List<Answer> answerList = List.of(
                new Answer("1", "Hallo", true),
                new Answer("2", "Hey", false),
                new Answer("3", "Hey123123", false),
                new Answer("4", "Hey3213232", false)
        );

        QuestionRepo questionRepo = new QuestionRepo();

        questionRepo.addQuestion(
                new Question("1", "Wie sagt man am besten guten Tag?", answerList));

        // WHEN
        String expected = "[Question(id=1, questionText=Wie sagt man am besten guten Tag?, answers=[Answer(id=1, answerText=Hallo, isCorrect=true), Answer(id=2, answerText=Hey, isCorrect=false), Answer(id=3, answerText=Hey123123, isCorrect=false), Answer(id=4, answerText=Hey3213232, isCorrect=false)])]";

        // THEN
        Assertions.assertEquals(expected, questionRepo.listQuestions());

    }

    @Test
    void get() {
        // GIVEN
        List<Answer> answerList = List.of(
                new Answer("1", "Hallo", true),
                new Answer("2", "Hey", false),
                new Answer("3", "Hey123123", false),
                new Answer("4", "Hey3213232", false)
        );

        QuestionRepo questionRepo = new QuestionRepo();

        List<Question> questionList = List.of(
                new Question("1", "Wie sagt man am besten guten Tag?", answerList),
                new Question("2", "Was ist das?", answerList),
                new Question("3", "Question 1238?", answerList)
        );

        // WHEN
        String excepted = "Question(id=2, questionText=Was ist das?, answers=[Answer(id=1, answerText=Hallo, isCorrect=true), Answer(id=2, answerText=Hey, isCorrect=false), Answer(id=3, answerText=Hey123123, isCorrect=false), Answer(id=4, answerText=Hey3213232, isCorrect=false)])";


        // THEN
        Assertions.assertEquals(excepted, questionList.get(1));


    }


    @Test
    void addQuestion() {
    }
}