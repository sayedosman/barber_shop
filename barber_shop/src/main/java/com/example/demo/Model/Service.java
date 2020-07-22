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
	private int id;
	private String desc;
	private String image;
	private String name;
	private List<ServicesType> servicesTypes;

	public Service() {
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


	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to ServicesType
	@OneToMany(mappedBy="service")
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