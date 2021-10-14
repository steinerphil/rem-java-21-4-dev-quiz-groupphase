package de.neuefische.devquiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

import java.util.Objects;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("QuestionsCollection") //for mongodb
public class Question {

    private String id;
    private String questionText;
    private List<Answer> answers;

}
