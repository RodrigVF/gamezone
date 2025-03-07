package com.rodrigvf.GameZone.infra.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Map<String, String>> handleDuplicateEventException(DuplicatedEventException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("Erro:", exception.getMessage());
        response.put("Mensagem:", "Por favor, insira um identificador válido para o evento e tente novamente.");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler
    public ResponseEntity<Map<String, String>> handleNotFoundEventException(NotFoundEventException exception) {
        Map<String, String> response = new HashMap<>();
        response.put("Erro:", exception.getMessage());
        response.put("Mensagem:", "Por favor, insira o identificador de um evento existente.");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
