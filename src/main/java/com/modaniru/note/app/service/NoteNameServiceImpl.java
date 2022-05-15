package com.modaniru.note.app.service;

import com.modaniru.note.app.dao.NoteNameRepository;
import com.modaniru.note.app.entity.Note;
import com.modaniru.note.app.entity.NoteName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteNameServiceImpl implements NoteNameService{

    @Autowired
    private NoteNameRepository noteNameRepository;

    @Override
    public void save(NoteName noteName) {
        noteNameRepository.save(noteName);
    }

    @Override
    public NoteName getNoteName(int id) {
        NoteName noteName = null;
        Optional<NoteName> optional = noteNameRepository.findById(id);
        if(optional.isPresent()){
            noteName = optional.get();
        }
        return noteName;
    }

    @Override
    public List<NoteName> getAll() {
        return noteNameRepository.findAll();
    }

    @Override
    public void delete(int id) {
        NoteName noteName = null;
        Optional<NoteName> optional = noteNameRepository.findById(id);
        if(optional.isPresent()){
            noteName = optional.get();
        }
        noteNameRepository.delete(noteName);
    }
}
