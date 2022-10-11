package com.example.slutprojekt;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class TeacherAnnouncement {
    @Id // Primärnyckeln
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private Long id;

    private String title;
    private String content;
    private String img = "/image/ads/default.png";
    private Timestamp date;
    private String teacherName;

    @ManyToOne
    private Teacher teacher;

    public TeacherAnnouncement(){}

    public TeacherAnnouncement(String title, String content, Timestamp  date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public TeacherAnnouncement(String title, String content, Teacher teacher, Timestamp date) {
        this.title = title;
        this.content = content;
        this.teacher = teacher;
        this.date = date;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = Timestamp.valueOf(date);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {this.teacher = teacher;}
}
