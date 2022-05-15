package com.modaniru.note.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "note_priority")
public class NotePriority{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "priority")
    private int priority;


    @JsonIgnore
    @OneToOne(mappedBy = "priority", cascade = CascadeType.ALL)
    private NotePreview notePreview;

    public NotePriority() {
    }

    public NotePriority(int priority) {
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public NotePreview getNotePreview() {
        return notePreview;
    }

    public void setNotePreview(NotePreview notePreview) {
        this.notePreview = notePreview;
    }

    @Override
    public String toString() {
        return "NotePriority{" +
                "id=" + id +
                ", priority=" + priority +
                '}';
    }
}
