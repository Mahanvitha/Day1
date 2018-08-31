package com.capgemini.day1;
import java.util.Scanner;
public class Discount {
public static Scanner sc;
public static void main(String[]args) {
	float newItem,discount=0,newItemPrice;
	sc =new Scanner(System.in);
	System.out.println("Enter the item price:");
	newItem = sc.nextFloat();
	discount = 35*newItem/100;
	System.out.println(discount);
	newItemPrice = newItem-discount;
	System.out.println("The discounted price of item is:"+newItemPrice);	
}
}
