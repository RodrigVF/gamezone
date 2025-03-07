package com.rodrigvf.GameZone.infra.exceptions;

public class DuplicatedEventException extends RuntimeException {
    public DuplicatedEventException(String message) {
        super(message);
    }
}
