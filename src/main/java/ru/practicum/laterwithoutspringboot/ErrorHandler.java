package ru.practicum.laterwithoutspringboot;

import lombok.extern.slf4j.Slf4j;
import org.postgresql.util.PSQLException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import ru.practicum.laterwithoutspringboot.exception.InactiveUrlException;
import ru.practicum.laterwithoutspringboot.exception.ItemNotFoundException;
import ru.practicum.laterwithoutspringboot.exception.UserNotFoundException;

import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler({UserNotFoundException.class, ItemNotFoundException.class, InactiveUrlException.class, PSQLException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handle404(RuntimeException e, WebRequest request) {
        log.error("{} {}", HttpStatus.NOT_FOUND.value(), e.getMessage());
        return new ErrorResponse(LocalDateTime.now().toString(), HttpStatus.NOT_FOUND.value(), e.getMessage());
    }
}
