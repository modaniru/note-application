package com.modaniru.note.app.service;

import com.modaniru.note.app.dao.NoteDateRepository;
import com.modaniru.note.app.entity.NoteDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteDateServiceImpl implements NoteDateService{
    @Autowired
    private NoteDateRepository noteDateRepository;

    @Override
    public void save(NoteDate noteDame) {
        noteDateRepository.save(noteDame);
    }

    @Override
    public NoteDate getNoteDate(int id) {
        NoteDate noteDate = null;
        Optional<NoteDate> optional = noteDateRepository.findById(id);
        if(optional.isPresent()){
            noteDate = optional.get();
        }
        return noteDate;
    }

    @Override
    public List<NoteDate> getAll() {
        return noteDateRepository.findAll();
    }

    @Override
    public void delete(int id) {
        NoteDate noteDate = null;
        Optional<NoteDate> optional = noteDateRepository.findById(id);
        if(optional.isPresent()){
            noteDate = optional.get();
        }
        noteDateRepository.delete(noteDate);
    }
}
