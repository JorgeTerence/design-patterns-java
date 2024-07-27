package org.example.ex2;

import java.time.LocalDate;

public class News {

    private String title;
    private String description;
    private LocalDate publishedDate;
    private LocalDate createdDate;
    private NewStatus status;
    private boolean active;

    public enum NewStatus {
        DRAFT, FIXED, PUBLISHED, OLD
    }

    public News(String description, String title) {
        this.status = NewStatus.DRAFT;
        this.createdDate = LocalDate.now();
        this.description = description;
        this.title = title;
        this.active = false;
    }

    public void publish(LocalDate publishedDate) {
        if (status.equals(NewStatus.DRAFT)) {
            status = NewStatus.PUBLISHED;
            active = true;
            this.publishedDate = publishedDate;
        }
    }

    public void shelve() {
        if (status.equals(NewStatus.DRAFT) || status.equals(NewStatus.PUBLISHED)) {
            status = NewStatus.OLD;
            active = false;
        }
    }

    public void fix(String title, String description, boolean activate) {
        if (status.equals(NewStatus.OLD)) {
            status = activate ? NewStatus.DRAFT : NewStatus.OLD;
            this.title = title;
            this.description = description;
        }
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

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public NewStatus getStatus() {
        return status;
    }

    public void setStatus(NewStatus status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}


