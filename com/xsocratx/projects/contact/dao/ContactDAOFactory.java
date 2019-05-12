package com.xsocratx.projects.contact.dao;

public class ContactDAOFactory {
	
	public static ContactDAO getContactDAO() {
        return new ContactSimpleDAO();
    }
}
