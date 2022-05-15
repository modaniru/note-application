package com.modaniru.note.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "note_date")
public class NoteDate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private String date;

    @JsonIgnore
    @OneToOne(mappedBy = "date", cascade = CascadeType.ALL)
    private NotePreview notePreview;

    public NoteDate() {
    }

    public NoteDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NotePreview getNotePreview() {
        return notePreview;
    }

    public void setNotePreview(NotePreview notePreview) {
        this.notePreview = notePreview;
    }

    @Override
    public String toString() {
        return "NoteDate{" +
                "id=" + id +
                ", date='" + date + '\'' +
                '}';
    }
}
