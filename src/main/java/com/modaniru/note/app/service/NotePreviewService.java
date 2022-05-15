package com.modaniru.note.app.service;

import com.modaniru.note.app.entity.NotePreview;

import java.util.List;

public interface NotePreviewService {
    void save(NotePreview notePreview);
    NotePreview getNotePreview(int id);
    List<NotePreview> getAll();
    void delete(int id);
}
