package de.neuefische.devquiz.controller.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ApiError {

    private String text;
    private String exceptionMessage;
    private LocalDateTime dateTime;

    public ApiError(String text, String exceptionMessage) {
        this.text = text;
        this.exceptionMessage = exceptionMessage;
        this.dateTime = LocalDateTime.now();
    }
}
