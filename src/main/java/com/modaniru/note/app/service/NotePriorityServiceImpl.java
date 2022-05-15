package com.modaniru.note.app.service;

import com.modaniru.note.app.dao.NotePriorityRepository;
import com.modaniru.note.app.entity.Note;
import com.modaniru.note.app.entity.NotePriority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotePriorityServiceImpl implements NotePriorityService{

    @Autowired
    private NotePriorityRepository notePriorityRepository;

    @Override
    public void save(NotePriority notePriority) {
        notePriorityRepository.save(notePriority);
    }

    @Override
    public NotePriority getNotePriority(int id) {
         NotePriority notePriority = null;
         Optional<NotePriority> optional = notePriorityRepository.findById(id);
         if(optional.isPresent()){
             notePriority = optional.get();
         }
         return notePriority;
    }

    @Override
    public List<NotePriority> getAll() {
        return notePriorityRepository.findAll();
    }

    @Override
    public void delete(int id) {

        NotePriority notePriority = null;
        Optional<NotePriority> optional = notePriorityRepository.findById(id);
        if(optional.isPresent()){
            notePriority = optional.get();
        }
        notePriorityRepository.delete(notePriority);
    }
}
