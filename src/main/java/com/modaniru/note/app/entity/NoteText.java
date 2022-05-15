package com.modaniru.note.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "note_text")
public class NoteText {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "text")
    private String text;

    public NoteText() {
    }

    public NoteText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "NoteText{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
