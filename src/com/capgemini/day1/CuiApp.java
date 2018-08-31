package com.capgemini.day1;
import java.util.Scanner;

public class CuiApp {
public static Scanner sc;
public static void main(String[]args) {
	String userid = "Mahanvitha";
	String paswrd = "123";
	String user;
	String pswrd;
	int n=0;
	sc = new Scanner(System.in);
	while(n<3)
	{
		System.out.print("Enter your userid:");
    	user = sc.nextLine();
    	System.out.print("Enter your password");
    	pswrd = sc.nextLine();
        for(int i=0;i<1;i++)
        {
    if(userid.equals(user) && paswrd.equals(pswrd)) {
    	System.out.print("Welcome "+userid);
    	return;
   
    }
    }
	n++;
	}
    if(n==3)
    {
    	System.out.println("Contact Admin");
    }
    	
}
}
