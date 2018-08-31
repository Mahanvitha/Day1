package com.capgemini.day1;
import java.util.Scanner;
public class Arm3 {
public static Scanner scan;	
public static void main(String []args) {
	int num,sum=0,rem,temp;
	scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	num = scan.nextInt();
	temp = num;
	while(num!=0)
	{
		rem = num%10;
		sum =  sum+(rem*rem*rem);
		num /= 10;
	}
	if (temp == sum)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
}
}
