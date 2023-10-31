package ro.uvt.info.designpatternslab2023.classes;

class Image extends Element {   // modificata
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image: " + imageName);
    }
}

