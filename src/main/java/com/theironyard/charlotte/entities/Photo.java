package com.theironyard.charlotte.entities;

import javax.persistence.*;

@Entity
@Table(name = "photos")
public class Photo {
    @Id
    @GeneratedValue
    int id;

    @ManyToOne
    User sender;

    @ManyToOne
    User recipient;

    @Column(nullable = false)
    String filename;

    @Column(nullable = false)
    int secondsDelete;

    public Photo() {
    }

    public Photo(User sender, User recipient, String filename, int secondsDelete) {
        this.sender = sender;
        this.recipient = recipient;
        this.filename = filename;
        this.secondsDelete = secondsDelete*1000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getSecondsDelete() {
        return secondsDelete;
    }

    public void setSecondsDelete(int secondsDelete) {
        this.secondsDelete = secondsDelete;
    }
}
