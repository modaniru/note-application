package com.modaniru.note.app.controller;


import com.modaniru.note.app.entity.*;
import com.modaniru.note.app.exception_handling.NoSuchNoteException;
import com.modaniru.note.app.service.NotePreviewService;
import com.modaniru.note.app.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    NoteService noteService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String getNote(@PathVariable("id") int id, Model model){
        Note note = noteService.getNote(id);
        model.addAttribute("note", note);
        return "note";
    }
}
