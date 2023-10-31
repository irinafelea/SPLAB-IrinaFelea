package ro.uvt.info.designpatternslab2023.classes;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public int createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}
