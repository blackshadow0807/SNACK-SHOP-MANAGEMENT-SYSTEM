package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Snack
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String custname;
	String item;
	int quantity;
	int price;
	public Snack() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Snack(int id, String custname, String item, int quantity, int price) {
		super();
		this.id = id;
		this.custname = custname;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Snack [id=" + id + ", custname=" + custname + ", item=" + item + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	
}
