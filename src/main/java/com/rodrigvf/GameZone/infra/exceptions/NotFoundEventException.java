package com.rodrigvf.GameZone.infra.exceptions;

public class NotFoundEventException extends RuntimeException {

    public NotFoundEventException (String message) {
        super(message);
    }

}
