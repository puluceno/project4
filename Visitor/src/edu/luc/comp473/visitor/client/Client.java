package edu.luc.comp473.visitor.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.luc.comp473.visitor.order.Order;
import edu.luc.comp473.visitor.order.OrderCompany;
import edu.luc.comp473.visitor.order.OrderExport;
import edu.luc.comp473.visitor.order.OrderPersonal;
import edu.luc.comp473.visitor.order.visit.OrderVisitor;
import edu.luc.comp473.visitor.order.visit.OrderVisitorImpl;
import edu.luc.comp473.visitor.product.Book;
import edu.luc.comp473.visitor.product.Helmet;
import edu.luc.comp473.visitor.product.Product;

public class Client {

	public static void main(String[] args) {
		List<Product> products1 = new ArrayList<Product>();
		List<Product> products2 = new ArrayList<Product>();
		List<Product> products3 = new ArrayList<Product>();
		Product book1 = new Book("Programming 1", 20, 1234);
		Product book2 = new Book("Programming 2", 30, 12345);
		Product book3 = new Book("Programming 3", 40, 123456);
		Product helmet1 = new Helmet("Shark RSi Pro", 260, 58);
		Product helmet2 = new Helmet("AGV Horizon", 290, 58);
		Product helmet3 = new Helmet("Shoei GT Air", 500, 56);

		Product[] aux1 = new Product[] { book1, book2, helmet1 };
		Product[] aux2 = new Product[] { book1, book2, book3, helmet2 };
		Product[] aux3 = new Product[] { book3, helmet1, helmet2, helmet3 };
		products1.addAll(Arrays.asList(aux1));
		products2.addAll(Arrays.asList(aux2));
		products3.addAll(Arrays.asList(aux3));

		// Total order price without discount = 310
		Order order1 = new OrderCompany(products1);

		// Total order price without discount = 380
		Order order2 = new OrderExport(products2);

		// Total order price without discount = 1090
		Order order3 = new OrderPersonal(products3);

		int total = calculatePrice(order1);
		System.out.println("Total Cost for order 1 with discounts = " + total
				+ "\n");

		total = calculatePrice(order2);
		System.out.println("Total Cost for order 1 with discounts = " + total
				+ "\n");

		total = calculatePrice(order3);
		System.out.println("Total Cost for order 1 with discounts = " + total
				+ "\n");
	}

	private static int calculatePrice(Order order) {
		OrderVisitor visitor = new OrderVisitorImpl();
		int sum = 0;
		return sum + order.accept(visitor);
	}

}
