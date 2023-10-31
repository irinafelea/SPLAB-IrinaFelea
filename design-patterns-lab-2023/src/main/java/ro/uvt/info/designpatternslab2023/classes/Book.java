package ro.uvt.info.designpatternslab2023.classes;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Chapter> chapters = new ArrayList<>();
    private Author author;

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }

    public int createChapter(String name) {
        Chapter chapter = new Chapter(name);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }

    public void print() {
        System.out.println("Title: " + title);
        author.print();
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}
