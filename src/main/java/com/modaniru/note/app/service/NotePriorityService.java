package com.modaniru.note.app.service;

import com.modaniru.note.app.entity.Note;
import com.modaniru.note.app.entity.NotePriority;

import java.util.List;

public interface NotePriorityService {
    void save(NotePriority notePriority);
    NotePriority getNotePriority(int id);
    List<NotePriority> getAll();
    void delete(int id);
}
