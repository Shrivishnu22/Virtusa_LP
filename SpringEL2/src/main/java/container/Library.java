package container;

import java.util.List;

public class Library {
	private List<Book> allBooks;
	private Book getFirstBook;

	public List<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}

	public Book getGetFirstBook() {
		return getFirstBook;
	}

	public void setGetFirstBook(Book getFirstBook) {
		this.getFirstBook = getFirstBook;
	}

}
