package de.neuefische.devquiz;

import de.neuefische.devquiz.model.Question;
import de.neuefische.devquiz.repo.QuestionRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToObject;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void contextLoads() {
    }
//
//    @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//    class QuestionServiceTest {
//
//        @LocalServerPort
//        private int port;
//
//        private String baseUrl = "http://localhost:8080/api";
//
//        @Autowired
//        private TestRestTemplate testRestTemplate;
//
//        QuestionRepo questionRepo = Mockito.mock(QuestionRepo.class);
//
//        @BeforeEach
//        public void clear() {
//            questionRepo.clear();
//        }
//
//        @Test
//        @DisplayName("returns a list of all existing questions")
//        void listQuestions() {
//            // GIVEN
//            questionRepo.addQuestion(new Question("33", "This is a question with id '33'", null));
//            questionRepo.addQuestion(new Question("66", "This is a question with id '66'", null));
//            questionRepo.addQuestion(new Question("99", "This is a question with id '99'", null));
//
//            // WHEN
//            ResponseEntity<Question> responseEntity = testRestTemplate.getForEntity(baseUrl, Question.class);
//
//            // THEN
//            assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));
//            assertThat(responseEntity.getBody(), equalToObject(questionRepo.listQuestions()));
//        }

}
