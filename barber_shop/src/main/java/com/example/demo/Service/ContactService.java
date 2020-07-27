package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Contact;
import com.example.demo.Repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
	
	public List<Contact>getAllContacts(){
		return contactRepository.findAll();
	}
	public Contact getContactById(Long id){
		return contactRepository.findById(id).get();
	}
   public Contact SaveContact(Contact contact) {
	   contactRepository.save(contact);
	   return contact;
	   
   }
}
