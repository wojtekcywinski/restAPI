package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class TaskDto {
    private Long id;
    private String title;
    private String content;

    public TaskDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public TaskDto() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}