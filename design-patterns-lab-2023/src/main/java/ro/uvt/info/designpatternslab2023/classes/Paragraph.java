package ro.uvt.info.designpatternslab2023.classes;

class Paragraph extends Element {   // modificata
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
