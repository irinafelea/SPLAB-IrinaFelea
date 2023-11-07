package ro.uvt.info.designpatternslab2023.classes;

public interface Element {

    void print();

    void add(Element e);

    void remove(Element e);

    Element get(int index);
}
