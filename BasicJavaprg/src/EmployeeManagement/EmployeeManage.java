package EmployeeManagement;

import java.util.Scanner;

public class EmployeeManage {

	
	
	public static void Login() {
		
		String Uname = "VB62722";
		String Pword = "Maveric@123";
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter user name");
		String userName = myObj.nextLine();  
		System.out.println("user name is "+userName);
		System.out.println("Enter the password");
		String passWord = myObj.nextLine();
		if(userName.equals(Uname) && passWord.equals(Pword)) {
			System.out.println("loggin successful");
		}
		else
		{
			System.out.println("Invalid vredentials");
		}
		
		myObj.close();
		
		
	}
	
	
	
	public static void main(String[] args) {

		Login();
		System.out.println("welcome to emplyee system");
		
		

	}

}
