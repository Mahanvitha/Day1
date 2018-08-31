package com.capgemini.day1;
import java.util.Scanner;
public class Pal2 {
public static Scanner scan;	
public static void main(String[]args) {
	int num,rev=0,rem,value;
	scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	num = scan.nextInt();
	value = num;
	while(num!=0)
	{
		rem = num%10;
		rev = rev*10+rem;
		num /= 10;
	}
	if (value == rev)
		System.out.println("True");
	else
		System.out.println("False");
}
}
