package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="booked_time")
	private Date bookedTime;

	@Column(name="client_name")
	private String clientName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date;


	private String phone;

	@Column(name="total_price")
	private float totalPrice;

	//bi-directional many-to-many association to ServicesType
	@ManyToMany(mappedBy="orders")
	private List<ServicesType> servicesTypes;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	private Employee employee;

	public Order() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getBookedTime() {
		return bookedTime;
	}

	public void setBookedTime(Date bookedTime) {
		this.bookedTime = bookedTime;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<ServicesType> getServicesTypes() {
		return servicesTypes;
	}

	public void setServicesTypes(List<ServicesType> servicesTypes) {
		this.servicesTypes = servicesTypes;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

}