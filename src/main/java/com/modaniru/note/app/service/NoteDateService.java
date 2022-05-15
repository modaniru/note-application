package com.modaniru.note.app.service;

import com.modaniru.note.app.entity.NoteDate;

import java.util.List;

public interface NoteDateService {
    void save(NoteDate noteName);
    NoteDate getNoteDate(int id);
    List<NoteDate> getAll();
    void delete(int id);
}
