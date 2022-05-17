package de.demmer.dennis;

public class Book {
	
	private String name;
	private long isbn;
	
	public Book(String name, long isbn) {
		this.name = name;
		this.isbn = isbn;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}





	public long getIsbn() {
		return isbn;
	}





	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}





	@Override
	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + "]";
	}
	
	
	

}
