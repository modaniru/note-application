package com.modaniru.note.app.dao;

import com.modaniru.note.app.entity.NoteDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDateRepository extends JpaRepository<NoteDate, Integer> {
}
