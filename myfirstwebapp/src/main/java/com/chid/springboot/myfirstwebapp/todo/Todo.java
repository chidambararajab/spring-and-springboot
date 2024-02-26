package com.chid.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

public class Todo {
    private long id;
    private String name;
    private String description;
    private LocalDate date;
    private boolean isDone;

    public Todo(long id, String name, String description, LocalDate date, boolean isDone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", isDone=" + isDone +
                '}';
    }
}
