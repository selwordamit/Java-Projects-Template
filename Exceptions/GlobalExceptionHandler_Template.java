package com.example.project.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;
import javax.validation.ConstraintViolationException;
import java.time.LocalDateTime;

/**
 * Handles global exceptions and formats error responses.
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleEntityNotFound(EntityNotFoundException ex) {
        log.warn("[ERROR] - Entity Not Found - {}", ex.getMessage());
        return ResponseEntity.badRequest().body(new ErrorResponse("NOT_FOUND", ex.getMessage(), LocalDateTime.now()));
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<?> handleValidationError(ConstraintViolationException ex) {
        log.warn("[ERROR] - Validation Failed - {}", ex.getMessage());
        return ResponseEntity.badRequest().body(new ErrorResponse("VALIDATION_ERROR", ex.getMessage(), LocalDateTime.now()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleGeneric(Exception ex) {
        log.error("[ERROR] - Unexpected Exception", ex);
        return ResponseEntity.internalServerError().body(new ErrorResponse("INTERNAL_ERROR", "Something went wrong", LocalDateTime.now()));
    }

    @Data
    @AllArgsConstructor
    static class ErrorResponse {
        private String code;
        private String message;
        private LocalDateTime timestamp;
    }
}
