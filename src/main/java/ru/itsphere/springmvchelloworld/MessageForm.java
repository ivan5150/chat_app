package ru.itsphere.springmvchelloworld;

public class MessageForm {

    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
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
        return "MessageForm{" +
                "author='" + author + '\'' +
                ", text=" + text +
                '}';
    }

}