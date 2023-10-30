package ro.uvt.info.designpatternslab2023.lab2.classes;

class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}