package edu.luc.comp473.visitor.order.visit;

import edu.luc.comp473.visitor.order.OrderCompany;
import edu.luc.comp473.visitor.order.OrderExport;
import edu.luc.comp473.visitor.order.OrderPersonal;
import edu.luc.comp473.visitor.product.Book;
import edu.luc.comp473.visitor.product.Helmet;
import edu.luc.comp473.visitor.product.Product;

public class OrderVisitorImpl implements OrderVisitor {

	@Override
	public int visit(OrderPersonal order) {
		int cost = 0;

		// apply 10% discount to any helmet in the order for personal Orders
		for (Product prod : order.getProducts()) {
			if (prod instanceof Helmet) {
				cost += prod.getPrice() * 0.9;
				System.out.println("Applying discount for item "
						+ prod.getName() + " - Original Price: "
						+ prod.getPrice() + ". Price after discount: "
						+ prod.getPrice() * 0.9);
			} else
				cost += prod.getPrice();
		}
		return cost;
	}

	@Override
	public int visit(OrderExport order) {
		int cost = 0;

		// apply 5% discount for all products in the order for Orders being
		// exported
		for (Product prod : order.getProducts()) {
			cost += prod.getPrice() * 0.95;
			System.out.println("Applying discount for item " + prod.getName()
					+ " - Original Price: " + prod.getPrice()
					+ ". Price after discount: " + prod.getPrice() * 0.95);
		}
		return cost;
	}

	@Override
	public int visit(OrderCompany order) {
		int cost = 0;

		// apply 15% discount for all Books in the order for companies Orders
		for (Product prod : order.getProducts()) {
			if (prod instanceof Book) {
				cost += prod.getPrice() * 0.85;
				System.out.println("Applying discount for item "
						+ prod.getName() + " - Original Price: "
						+ prod.getPrice() + ". Price after discount: "
						+ prod.getPrice() * 0.85);
			} else
				cost += prod.getPrice();
		}
		return cost;

	}

}
