package quotes;

import java.util.ArrayList;

public class Books {
    String author;
    String text;

    public Books(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }
}
