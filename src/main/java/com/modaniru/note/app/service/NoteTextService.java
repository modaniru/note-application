package com.modaniru.note.app.service;

import com.modaniru.note.app.entity.Note;
import com.modaniru.note.app.entity.NoteText;

import java.util.List;

public interface NoteTextService {
    void save(NoteText noteText);
    NoteText getNoteText(int id);
    List<NoteText> getAll();
    void delete(int id);
}
