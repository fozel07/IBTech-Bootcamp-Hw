package com.fatih.user;

public class testUser {
	public static void main(String[] args) throws Exception {
		   UserManager userManager=new UserManager();
		   User user=userManager.findByUserName("fatih");
		   
		   System.out.println(user.getUserPassword());
	}

}
