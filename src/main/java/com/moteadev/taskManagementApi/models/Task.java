package com.moteadev.taskManagementApi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;

import java.util.UUID;

public class Task {
    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", isDone=" + isDone +
                '}';
    }

    private static final Log log = LogFactory.getLog(Task.class);
    private String id;
    private String title;
    private String description;
    private long createdAt;
    private boolean isDone;
    @JsonCreator
    public Task(
            @JsonProperty("id")
            String id,@JsonProperty("title") String title, @JsonProperty("description") String description,
            @JsonProperty("createdAt") long createdAt,@JsonProperty("done") boolean isDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.isDone = isDone;
    }


    public Task(String title,
          String description,
        boolean isDone) {
        this.id= UUID.randomUUID().toString();
        this.title = title;
        this.description = description;
        this.createdAt = System.currentTimeMillis();
        this.isDone = isDone;
    }

    public Task() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // نفس المرجع
        if (obj == null || getClass() != obj.getClass()) return false;
        Task other = (Task) obj;
        return id.equals(other.id);
    }
}
