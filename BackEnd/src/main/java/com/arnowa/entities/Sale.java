package com.arnowa.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
public class Sale {
	
	String country;
	int quantity;
	int amount;
	String year;
	User user;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Sale [country=" + country + ", quantity=" + quantity + ", amount=" + amount + ", year=" + year
				+ ", user=" + user + "]";
	}
	public Sale(String country, int quantity, int amount, String year, User user) {
		super();
		this.country = country;
		this.quantity = quantity;
		this.amount = amount;
		this.year = year;
		this.user = user;
	}
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
