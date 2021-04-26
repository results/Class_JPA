package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the orderdetails database table.
 * 
 */
@Entity
@Table(name="orderdetails")
@NamedQuery(name="Orderdetail.findAll", query="SELECT o FROM Orderdetail o")
public class Orderdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int orderNumber;

	private short orderLineNumber;

	private double priceEach;

	private int quantityOrdered;

	public Orderdetail() {
	}

	public int getId() {
		return this.orderNumber;
	}

	public void setId(int id) {
		this.orderNumber = id;
	}

	public short getOrderLineNumber() {
		return this.orderLineNumber;
	}

	public void setOrderLineNumber(short orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public double getPriceEach() {
		return this.priceEach;
	}

	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
	}

	public int getQuantityOrdered() {
		return this.quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	
	public String toString() {
		return "ID: "+getId()+" - price: "+getPriceEach()+" - quantity: "+getQuantityOrdered();
	}

}