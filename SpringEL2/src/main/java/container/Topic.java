package container;

import java.util.List;

public class Topic {
	private List<Book> bookList;

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public Book getFirstBook() {
		return bookList.get(0);
	}
}
