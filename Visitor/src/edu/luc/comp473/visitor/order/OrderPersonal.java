package edu.luc.comp473.visitor.order;

import java.util.List;

import edu.luc.comp473.visitor.order.visit.OrderVisitor;
import edu.luc.comp473.visitor.product.Product;

public class OrderPersonal extends Order {

	public OrderPersonal(List<Product> products) {
		super(products);
	}

	@Override
	public int accept(OrderVisitor visitor) {
		return visitor.visit(this);
	}
}
