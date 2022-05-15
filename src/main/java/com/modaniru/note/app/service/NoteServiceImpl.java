package com.modaniru.note.app.service;

import com.modaniru.note.app.dao.NoteRepository;
import com.modaniru.note.app.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public void save(Note note) {
        noteRepository.save(note);
    }

    @Override
    public Note getNote(int id) {
        Note note = null;
        Optional<Note> optional =noteRepository.findById(id);
        if(optional.isPresent()){
            note = optional.get();
        }
        return note;
    }

    @Override
    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    @Override
    public void delete(int id) {
        Note note = null;
        Optional<Note> optional =noteRepository.findById(id);
        if(optional.isPresent()){
            note = optional.get();
        }
        noteRepository.delete(note);
    }
}
