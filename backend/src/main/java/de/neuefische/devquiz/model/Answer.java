package de.neuefische.devquiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer {

    private String id;
    private String answerText;
    boolean isCorrect;

}
