package com.modaniru.note.app.dao;

import com.modaniru.note.app.entity.NoteName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteNameRepository extends JpaRepository<NoteName, Integer> {
}
