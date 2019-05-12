package com.xsocratx.projects.contact.test;

import com.xsocratx.projects.contact.business.ContactManager;
import com.xsocratx.projects.contact.entity.Contact;
import java.util.List;

public class ContactTest 
{
	public static void main(String[] args) {
		ContactManager cm = new ContactManager();
        
        Contact c1 = new Contact("����", "������", "+911-830-7366", "ivanov@yandex.ru");
        Contact c2 = new Contact("������", "�������", "+911-898-7725", "sidorov@google.com");
        Contact c3 = new Contact("�������", "����������", "+911-870-1764", "avgustovich@mail.ru");
 
        System.out.println("ADD CONTACT ==============");
        Long cId1 = cm.addContact(c1);
        Long cId2 = cm.addContact(c2);
        Long cId3 = cm.addContact(c3);
        List<Contact> result1 = cm.findContacts();
        for(Contact c : result1) {
            System.out.println(c);
        }
        
        System.out.println("UPDATE CONTACT ==============");
        Contact change = new Contact(cId1, "����", "������", "+911-830-7366", "ivanov@yandex.ru");
        cm.updateContact(change);
        List<Contact> result2 = cm.findContacts();
        for(Contact c : result2) {
            System.out.println(c);
        }
        
        System.out.println("DELETE CONTACT ==============");
        cm.deleteContact(cId1);
        List<Contact> result3 = cm.findContacts();
        for(Contact c : result3) {
            System.out.println(c);
        }
 
        System.out.println("GET CONTACT ==============");
        Contact contact = cm.getContact(cId2);
        System.out.println(contact);
				
	}
}
