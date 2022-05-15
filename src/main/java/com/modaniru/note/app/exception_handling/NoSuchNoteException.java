package com.modaniru.note.app.exception_handling;

public class NoSuchNoteException extends RuntimeException{
    public NoSuchNoteException(String message){
        super(message);
    }
}
