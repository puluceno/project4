package edu.luc.comp473.visitor.order;

import java.util.List;

import edu.luc.comp473.visitor.order.visit.OrderVisitor;
import edu.luc.comp473.visitor.product.Product;

public abstract class Order {

	private List<Product> products;

	public Order(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public abstract int accept(OrderVisitor visitor);
}
