package com.anas.spring.todo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document(collection = "todos")
public class Todo {
    private String id;
    private String title;
    private String description;
    private boolean completed;
    private long timestamp;

    private Todo() {
        this(null, null, null, false);
    }
    public Todo(final String id, final String title, final String description, final boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.timestamp = System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(final boolean completed) {
        this.completed = completed;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
