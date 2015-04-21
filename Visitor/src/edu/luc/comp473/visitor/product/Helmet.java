package edu.luc.comp473.visitor.product;

public class Helmet extends Product {

	private int size;

	public Helmet(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
