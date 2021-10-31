package com.arnowa.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
	@Id
	String email;
	String fullName;
	String password;
	public List<Sale> sale;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String email, String fullName, String password, List<Sale> sale) {
		super();
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.sale = sale;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Sale> getSale() {
		return sale;
	}
	public void setSale(List<Sale> sale) {
		this.sale = sale;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", fullName=" + fullName + ", password=" + password + ", sale=" + sale + "]";
	}
	
	
	
	

	

}
