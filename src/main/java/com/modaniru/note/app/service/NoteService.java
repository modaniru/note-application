package com.modaniru.note.app.service;

import com.modaniru.note.app.entity.Note;

import java.util.List;
import java.util.Optional;

public interface NoteService {
    void save(Note note);
    Note getNote(int id);
    List<Note> getAll();
    void delete(int id);
}
