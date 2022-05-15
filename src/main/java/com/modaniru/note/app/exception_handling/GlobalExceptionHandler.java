package com.modaniru.note.app.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<NoSuchNoteException> handlerException(NoSuchNoteException exception){
        NoteIncorrectData noteIncorrectData = new NoteIncorrectData();
        noteIncorrectData.setInfo(exception.getMessage());
        return new ResponseEntity(noteIncorrectData, HttpStatus.NOT_FOUND);
    }
    public ResponseEntity<Exception> handlerException(Exception exception){
        NoteIncorrectData noteIncorrectData = new NoteIncorrectData();
        noteIncorrectData.setInfo(exception.getMessage());
        return new ResponseEntity(noteIncorrectData, HttpStatus.BAD_REQUEST);
    }
}
