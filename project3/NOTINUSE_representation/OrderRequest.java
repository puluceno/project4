/**
 * 
 */
package edu.luc.comp433.service.representation;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bruno Correa <brunogmc at gmail>
 *
 */
@XmlRootElement
public class OrderRequest {

	private String customerLogin;
	private Short addressId;
	private Short paymentId;
	private List<Short> bookIdList;

	/**
	 * @return the customerId
	 */
	public String getCustomerLogin() {
		return customerLogin;
	}

	/**
	 * @param customerLogin
	 *            the customerLogin to set
	 */
	public void setCustomerLogin(String customerLogin) {
		this.customerLogin = customerLogin;
	}

	/**
	 * @return the addressId
	 */
	public Short getAddressId() {
		return addressId;
	}

	/**
	 * @param addressId
	 *            the addressId to set
	 */
	public void setAddressId(Short addressId) {
		this.addressId = addressId;
	}

	/**
	 * @return the paymentId
	 */
	public Short getPaymentId() {
		return paymentId;
	}

	/**
	 * @param paymentId
	 *            the paymentId to set
	 */
	public void setPaymentId(Short paymentId) {
		this.paymentId = paymentId;
	}

	/**
	 * @return the bookIdList
	 */
	public List<Short> getBookIdList() {
		return bookIdList;
	}

	/**
	 * @param bookIdList
	 *            the bookIdList to set
	 */
	public void setBookIdList(List<Short> bookIdList) {
		this.bookIdList = bookIdList;
	}
}
