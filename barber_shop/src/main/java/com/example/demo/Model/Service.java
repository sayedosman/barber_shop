package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the services database table.
 * 
 */
@Entity
@Table(name="services")
@NamedQuery(name="Service.findAll", query="SELECT s FROM Service s")
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
   @Column(name="description")
	private String desc;

	private String name;

	private String picture;

	//bi-directional many-to-one association to ServicesType
	@OneToMany(mappedBy="service")
	private List<ServicesType> servicesTypes;

	public Service() {
	}

	public Service(long id, String desc, String name, String picture, List<ServicesType> servicesTypes) {
		this.id = id;
		this.desc = desc;
		this.name = name;
		this.picture = picture;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public List<ServicesType> getServicesTypes() {
		return this.servicesTypes;
	}

	public void setServicesTypes(List<ServicesType> servicesTypes) {
		this.servicesTypes = servicesTypes;
	}

	public ServicesType addServicesType(ServicesType servicesType) {
		getServicesTypes().add(servicesType);
		servicesType.setService(this);

		return servicesType;
	}

	public ServicesType removeServicesType(ServicesType servicesType) {
		getServicesTypes().remove(servicesType);
		servicesType.setService(null);

		return servicesType;
	}

}