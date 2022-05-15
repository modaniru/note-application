package com.modaniru.note.app.service;

import com.modaniru.note.app.dao.NotePreviewRepository;
import com.modaniru.note.app.entity.NotePreview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotePreviewServiceImpl implements NotePreviewService{
    @Autowired
    private NotePreviewRepository notePreviewRepository;

    @Override
    public void save(NotePreview notePreview) {
        notePreviewRepository.save(notePreview);
    }

    @Override
    public NotePreview getNotePreview(int id) {
        NotePreview notePreview = null;
        Optional<NotePreview> optional = notePreviewRepository.findById(id);
        if(optional.isPresent()){
            notePreview = optional.get();
        }
        return notePreview;
    }

    @Override
    public List<NotePreview> getAll() {
        return notePreviewRepository.findAll();
    }

    @Override
    public void delete(int id) {
        NotePreview notePreview = null;
        Optional<NotePreview> optional = notePreviewRepository.findById(id);
        if(optional.isPresent()){
            notePreview = optional.get();
        }
        notePreviewRepository.delete(notePreview);
    }
}
