package container;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {
	public static void main(String args[]) {

		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		Topic t1 = a.getBean("t1", Topic.class);
		for (Book b : t1.getBookList()) {
			System.out.println(b.getBookId() + " " + b.getBookName());
		}
		Topic t2 = a.getBean("t2", Topic.class);
		for (Book b : t2.getBookList()) {
			System.out.println(b.getBookId() + " " + b.getBookName());
		}
		System.out.println("--------------------------");

		Library l1 = (Library) a.getBean("l1");
		Library l2 = (Library) a.getBean("l2");
		List<Book> allbooks = l1.getAllBooks();
		for (Book b : allbooks)
			System.out.println(b.getBookId() + " " + b.getBookName());
		Book fistBook = l1.getGetFirstBook();
		System.out.println("this is the first book: " + fistBook.getBookId() + " " + fistBook.getBookName());
		
		List<Book> allbooks1 = l2.getAllBooks();
		for (Book b : allbooks1)
			System.out.println(b.getBookId() + " " + b.getBookName());
		System.out.println("this is the first book: " + l2.getGetFirstBook().getBookId() + " "
				+ l2.getGetFirstBook().getBookName());

	}

}
