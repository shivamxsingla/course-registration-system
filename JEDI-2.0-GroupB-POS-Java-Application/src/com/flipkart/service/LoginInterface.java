package com.flipkart.service;


public interface LoginInterface {
	
	public boolean login();
	
	public boolean userExists(int id);
	
	public boolean verifyPassword(int id, String inputPassword);
	public boolean verifyRole(int id, String inputRole);
}
