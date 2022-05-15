package com.modaniru.note.app.service;

import com.modaniru.note.app.dao.NoteTextRepository;
import com.modaniru.note.app.entity.Note;
import com.modaniru.note.app.entity.NoteText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteTextServiceImpl implements NoteTextService{

    @Autowired
    private NoteTextRepository noteTextRepository;

    @Override
    public void save(NoteText noteText) {
        noteTextRepository.save(noteText);
    }

    @Override
    public NoteText getNoteText(int id) {
        NoteText noteText = null;
        Optional<NoteText> optional = noteTextRepository.findById(id);
        if(optional.isPresent()){
            noteText = optional.get();
        }
        return noteText;
    }

    @Override
    public List<NoteText> getAll() {
        return noteTextRepository.findAll();
    }

    @Override
    public void delete(int id) {
        NoteText noteText = null;
        Optional<NoteText> optional = noteTextRepository.findById(id);
        if(optional.isPresent()){
            noteText = optional.get();
        }
        noteTextRepository.delete(noteText);
    }
}
