package edu.luc.comp473.visitor.order.visit;

import edu.luc.comp473.visitor.order.OrderCompany;
import edu.luc.comp473.visitor.order.OrderExport;
import edu.luc.comp473.visitor.order.OrderPersonal;

public interface OrderVisitor {

	/**
	 * Method responsible for applying a special discount for a given order
	 * type.
	 * 
	 * @param order
	 * @return
	 */
	public int visit(OrderPersonal order);

	/**
	 * Method responsible for applying a special discount for a given order
	 * type.
	 * 
	 * @param order
	 * @return
	 */
	public int visit(OrderExport order);

	/**
	 * Method responsible for applying a special discount for a given order
	 * type.
	 * 
	 * @param order
	 * @return
	 */
	public int visit(OrderCompany order);

}
