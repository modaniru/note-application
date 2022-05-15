package com.modaniru.note.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "note_preview")
public class NotePreview{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_note_name")
    private NoteName name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_note_date")
    private NoteDate date;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_note_priority")
    private NotePriority priority;

    public NotePreview() {
    }

    public NotePreview(NoteName name, NoteDate date, NotePriority priority) {
        this.name = name;
        this.date = date;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NoteName getName() {
        return name;
    }

    public void setName(NoteName name) {
        this.name = name;
    }

    public NoteDate getDate() {
        return date;
    }

    public void setDate(NoteDate date) {
        this.date = date;
    }

    public NotePriority getPriority() {
        return priority;
    }

    public void setPriority(NotePriority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "NotePreview{" +
                "id=" + id +
                ", name=" + name +
                ", date=" + date +
                ", priority=" + priority +
                '}';
    }
}
