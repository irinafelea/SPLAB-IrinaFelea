package ro.uvt.info.designpatternslab2023.lab2.classes;

public class Author {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}
