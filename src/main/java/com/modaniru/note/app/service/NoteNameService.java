package com.modaniru.note.app.service;

import com.modaniru.note.app.entity.Note;
import com.modaniru.note.app.entity.NoteName;

import java.util.List;

public interface NoteNameService {
    void save(NoteName noteName);
    NoteName getNoteName(int id);
    List<NoteName> getAll();
    void delete(int id);
}
