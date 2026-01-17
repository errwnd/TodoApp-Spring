package org.example.todoApp.todo;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private boolean completed;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate deadline;

    public Todo() {}

    public Todo(String title, LocalDate deadline) {
        this.title = title;
        this.deadline = deadline;
        this.completed = false;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }
    public LocalDate getDeadline() { return deadline; }

    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }
}
