package com.modaniru.note.app.dao;

import com.modaniru.note.app.entity.NoteText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteTextRepository extends JpaRepository<NoteText, Integer> {
}
