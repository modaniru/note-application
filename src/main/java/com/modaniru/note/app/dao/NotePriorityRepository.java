package com.modaniru.note.app.dao;

import com.modaniru.note.app.entity.NotePriority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotePriorityRepository extends JpaRepository<NotePriority, Integer>{
}
