package com.modaniru.note.app.controller;

import com.modaniru.note.app.entity.NotePreview;
import com.modaniru.note.app.exception_handling.NoSuchNoteException;
import com.modaniru.note.app.service.NotePreviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotePreviewController {

    @Autowired
    private NotePreviewService notePreviewService;

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("notePreview")
    public List<NotePreview> getAllNotePreview(){
        List<NotePreview> notes = notePreviewService.getAll();
        if(notes.isEmpty()){
            throw new NoSuchNoteException("you don't have any notes");
        }
        return notes;
    }
}
