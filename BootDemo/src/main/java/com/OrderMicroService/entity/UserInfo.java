package com.OrderMicroService.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "USER_MST")
public class UserInfo {
	@Id
	@GeneratedValue
	private Long userId;
	private String name;
	private String email;
	private String phoneNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dob;

	@OneToMany(mappedBy = "userinfo")
	@JoinColumn(name = "user_id")
	List<Order> userOrder = new ArrayList<Order>();

	@Override
	public String toString() {
		return "UserInfo [Uid=" + userId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", dob=" + dob + ", userOrder=" + userOrder + "]";
	}

	

	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<Order> getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(List<Order> userOrder) {
		this.userOrder = userOrder;
	}

}
