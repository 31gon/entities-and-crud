package dev.triacontakaihenagon.entitiesandcrud;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String message) {
        super(message);
    }
}