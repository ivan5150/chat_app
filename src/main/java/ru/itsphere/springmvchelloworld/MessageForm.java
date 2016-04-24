package ru.itsphere.springmvchelloworld;

public class MessageForm {

    private String authorName;
    private String text;

    /*public MessageForm(String authorName, String text) {
        this.authorName = authorName;
        this.text = text;
    }*/

    public String getName() {
        return authorName;
    }

    public void setName(String authorName) {
        this.authorName = authorName;
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
                "author='" + authorName + '\'' +
                ", text=" + text +
                '}';
    }

}