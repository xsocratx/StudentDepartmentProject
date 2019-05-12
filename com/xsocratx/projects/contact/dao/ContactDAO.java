package com.xsocratx.projects.contact.dao;

import com.xsocratx.projects.contact.entity.Contact;
import java.util.List;

public interface ContactDAO {
	
    public Long addContact(Contact contact);
    
    public void updateContact(Contact contact);
    
    public void deleteContact(Long contactId);
    
    public Contact getContact(Long contactId);
    
    public List<Contact> findContacts();

}
