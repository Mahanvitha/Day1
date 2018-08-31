package com.capgemini.day1;
import java.util.Scanner;

public class ResultDeclaration {
public static Scanner scan;
public static void main(String[]args) {
	int math,sci,phy,count=0;
	scan = new Scanner(System.in);
	
	System.out.println("Enter maths marks:");
	math = scan.nextInt();
	
	System.out.println("Enter science marks:");
	sci = scan.nextInt();
   
	System.out.println("Enter physics marks:");
	 phy = scan.nextInt();
	if(math>0 && sci>0 && phy>0) {
	if(math>60) {
		count++;
	}
	if(sci>60) {
		count++;
	}
	if(phy>60) {
		count++;
	}
	}
	switch (count)
	{
	case 0:System.out.println("Fail");break;
	case 1:System.out.println("Fail");break;
	case 2:System.out.println("promoted");break;
	
	case 3:System.out.println("pass");break;
	}
	}
}




	
