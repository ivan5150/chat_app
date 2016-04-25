package ru.itsphere.springmvchelloworld;

public class Message {

    private String author;
    private String text;

    public Message(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthorN() {
        return author;
    }

    public void setAuthorN(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return author + ' ' + text;
    }

}