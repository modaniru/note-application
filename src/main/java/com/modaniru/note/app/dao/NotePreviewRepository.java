package com.modaniru.note.app.dao;

import com.modaniru.note.app.entity.NotePreview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotePreviewRepository extends JpaRepository<NotePreview, Integer> {
}
