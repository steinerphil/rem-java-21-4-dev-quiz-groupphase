package de.neuefische.devquiz.repo;

import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.service.IdService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class QuestionRepoTest {

    private final IdService idService = mock(IdService.class);

    @Test
    void listQuestions() {
        // GIVEN
        QuestionRepo questionRepo = new QuestionRepo(idService);
        when(idService.generateId())
                .thenReturn("1").thenReturn("2").thenReturn("3");
        questionRepo.addQuestion(new Question("1", "Whats the most beautiful lombock?", List.of()));
        questionRepo.addQuestion(new Question("2", "Whats the most beautiful dog?", List.of()));
        questionRepo.addQuestion(new Question("3", "Whats the most beautiful hamcrest?", List.of()));

        List<Question> expected = List.of(
                new Question("1", "Whats the most beautiful lombock?", List.of()),
                new Question("2", "Whats the most beautiful dog?", List.of()),
                new Question("3", "Whats the most beautiful hamcrest?", List.of())
        );

        // WHEN
        List<Question> actual = questionRepo.getAllQuestions();

        // THEN
        assertEquals(expected, actual);
        verify(idService, times(3)).generateId();

    }

    @Test
    void get() {
        // GIVEN
        QuestionRepo questionRepo = new QuestionRepo(idService);
        when(idService.generateId())
                .thenReturn("1").thenReturn("2").thenReturn("3");

        questionRepo.addQuestion(new Question("1", "Wie sagt man am besten guten Tag?", List.of()));
        questionRepo.addQuestion(new Question("2", "Was ist das?", List.of()));
        questionRepo.addQuestion(new Question("3", "Question 1238?", List.of()));

        // WHEN
        Question expected1 = new Question("1", "Wie sagt man am besten guten Tag?", List.of());
        Question expected2 = new Question("2", "Was ist das?", List.of());
        Question expected3 = new Question("3", "Question 1238?", List.of());


        // THEN
        assertEquals(Optional.of(expected1), questionRepo.get("1"));
        assertEquals(Optional.of(expected2), questionRepo.get("2"));
        assertEquals(Optional.of(expected3), questionRepo.get("3"));

        verify(idService, times(3)).generateId();
    }

    @Test
    void addQuestion() {
        // GIVEN
        Question questionToAdd = new Question("4", "Hallo", List.of());
        QuestionRepo questionRepo = new QuestionRepo(idService);
        when(idService.generateId()).thenReturn("4");

        // WHEN
        questionRepo.addQuestion(questionToAdd);

        //THEN
        assertEquals(questionRepo.get("4"), Optional.of(questionToAdd));
        verify(idService).generateId();
    }
}