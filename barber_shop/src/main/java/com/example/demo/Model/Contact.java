package com.example.demo.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the contact database table.
 * 
 */
@Entity
@Table(name="contact")
public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;


	private String name;

	private String phone;

	@Column(name="u_mail")
	private String uMail;

	@Column(name="u_msg")
	private String uMsg;

	

	public Contact() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getuMail() {
		return uMail;
	}

	public void setuMail(String uMail) {
		this.uMail = uMail;
	}

	public String getuMsg() {
		return uMsg;
	}

	public void setuMsg(String uMsg) {
		this.uMsg = uMsg;
	}

	
}