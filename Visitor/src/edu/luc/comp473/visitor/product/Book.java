package edu.luc.comp473.visitor.product;

public class Book extends Product {

	private int isbn;

	public Book(String name, int price, int isbn) {
		super(name, price);
		this.isbn = isbn;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

}
