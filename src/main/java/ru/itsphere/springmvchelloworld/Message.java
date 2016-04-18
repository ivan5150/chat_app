package ru.itsphere.springmvchelloworld;

public class Message {

    private String authorName;
    private String text;

    public Message(String authorName, String text) {
        this.authorName = authorName;
        this.text = text;
    }

    public String getName() {
        return authorName;
    }

    public void setName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String authorText) {
        this.text = authorText;
    }

    @Override
    public String toString() {
        return authorName + ' ' + text;
    }

}