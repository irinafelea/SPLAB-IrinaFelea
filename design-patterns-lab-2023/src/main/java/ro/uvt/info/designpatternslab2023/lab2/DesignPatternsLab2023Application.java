package ro.uvt.info.designpatternslab2023.lab2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.uvt.info.designpatternslab2023.lab2.classes.Author;
import ro.uvt.info.designpatternslab2023.lab2.classes.Book;
import ro.uvt.info.designpatternslab2023.lab2.classes.Chapter;
import ro.uvt.info.designpatternslab2023.lab2.classes.SubChapter;

@SpringBootApplication
public class DesignPatternsLab2023Application {

	public static void main(String[] args) {
		Book discoTitanic = new Book("Disco Titanic");
		Author author = new Author("Radu Pavel Gheo");
		discoTitanic.addAuthor(author);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		scOneOne.print();
	}

}
