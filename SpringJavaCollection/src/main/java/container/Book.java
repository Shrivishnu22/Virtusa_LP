package container;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Book {
	private int id;
	private Map<String, Integer> book;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Integer> getBook() {
		return book;
	}

	public void setBook(Map<String, Integer> book) {
		this.book = book;
	}

	public void display() {
		System.out.println("Id of the Book :" + id);
		for (Entry<String, Integer> it : book.entrySet()) {
			System.out.println("->" + it.getKey() + " " + it.getValue());
		}
		System.out.println();
	}

}
