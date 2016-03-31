package ru.itsphere.springmvchelloworld;

/**
 * Created by 5150 on 30.03.2016.
 */
public class Message {

    private String authorName;
    private String authorText;

    public Message(String authorName, String authorText) {
        this.authorName = authorName;
        this.authorText = authorText;
    }

    public String getName() {
        return authorName;
    }

    public void setName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return authorText;
    }

    public void setText(String authorText) {
        this.authorText = authorText;
    }

    @Override
    public String toString() {
        return authorName + ' ' + authorText;
    }


    //Message a = new Message("1", "2");
}