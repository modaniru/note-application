package com.modaniru.note.app.controller;


import com.modaniru.note.app.entity.*;
import com.modaniru.note.app.exception_handling.NoSuchNoteException;
import com.modaniru.note.app.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(value = "/note", produces = "application/json")
    public List<Note> getAllNotes(){
        return noteService.getAll();
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(value = "/note/{id}",  produces = "application/json")
    public Note getNote(@PathVariable int id){
        Note note = noteService.getNote(id);
        if(note==null){
            throw new NoSuchNoteException("A note was not found");
        }
        return note;
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @PostMapping(value = "/note", produces = "application/json")
    public void saveNote(@RequestBody Note note){
        noteService.save(note);
    }

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @DeleteMapping(value = "/note{id}", produces = "application/json")
    public String deleteNote(@PathVariable int id){
        Note note = noteService.getNote(id);
        if(note==null){
            throw new NoSuchNoteException("A note was not found");
        }
        noteService.delete(id);
        return "A note with id: " + id + " was deleted";
    }
}
