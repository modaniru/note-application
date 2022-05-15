package com.modaniru.note.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "note_name")
public class NoteName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @OneToOne(mappedBy = "name", cascade = CascadeType.ALL)
    private NotePreview notePreview;

    public NoteName() {
    }

    public NoteName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotePreview getNotePreview() {
        return notePreview;
    }

    public void setNotePreview(NotePreview note) {
        this.notePreview = note;
    }

    @Override
    public String toString() {
        return "NoteName{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
