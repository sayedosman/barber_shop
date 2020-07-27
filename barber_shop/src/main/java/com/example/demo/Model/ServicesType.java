package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the services_type database table.
 * 
 */
@Entity
@Table(name="services_type")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class,
		  property = "id")
public class ServicesType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	 @Column(name="description")
	private String desc;

	@Column(name="estimated_time")
	private Time estimatedTime;

	private String name;

	private float price;

	//bi-directional many-to-many association to Order
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name="order_services"
		, joinColumns={
			@JoinColumn(name="service_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="order_id")
			}
		)
	
	@JsonManagedReference
	private List<Order> orders;

	//bi-directional many-to-one association to Service
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="service_id")
	@JsonBackReference
	private Service service;

	public ServicesType() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Time getEstimatedTime() {
		return this.estimatedTime;
	}

	public void setEstimatedTime(Time estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}