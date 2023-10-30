package ro.uvt.info.designpatternslab2023.classes;

class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table: " + title);
    }
}
