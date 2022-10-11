package com.example.slutprojekt;

import javax.persistence.*;

@Entity
public class TeacherAnnouncement {
    @Id // Primärnyckeln
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Long id;

    private String title;
    private String content;
    private String img = "/image/ads/default.png";
    private String date;

    @ManyToOne
    private Teacher teacher;

    public TeacherAnnouncement(){}

    public TeacherAnnouncement(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {this.teacher = teacher;}
}