package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the services_type database table.
 * 
 */
@Entity
@Table(name="services_type")
@NamedQuery(name="ServicesType.findAll", query="SELECT s FROM ServicesType s")
public class ServicesType implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String desc;
	private String name;
	private double price;
	private Time time;
	private List<Order> orders;
	private Service service;

	public ServicesType() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}


	//bi-directional many-to-many association to Order
	@ManyToMany
	@JoinTable(
		name="order_services"
		, joinColumns={
			@JoinColumn(name="service_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="order_id")
			}
		)
	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}


	//bi-directional many-to-one association to Service
	@ManyToOne(fetch=FetchType.LAZY)
	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}