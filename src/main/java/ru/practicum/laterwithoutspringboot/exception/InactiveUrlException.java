package ru.practicum.laterwithoutspringboot.exception;

import org.springframework.http.HttpStatus;

public class InactiveUrlException extends RuntimeException {
    public InactiveUrlException() {
    }

    public InactiveUrlException(String url, HttpStatus httpStatus) {
        super("URL " + url + " is inactive! Status " + httpStatus);
    }
}
