package quotes;

import java.util.ArrayList;

public class Books {
    String author;
    String text;

    public Books(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }


    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
