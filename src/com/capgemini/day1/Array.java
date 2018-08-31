package com.capgemini.day1;
import java.util.Scanner;

public class Array {
public static Scanner sc;
public static void main(String[]args) {
	int n;
	int a[] = {1,5,6,7,12,14,15,16,18,20,22,24,25,26,28};
	sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	n = sc.nextInt();
	
	for(int i=0;i<15;) {
		if(a[i]==n) {
			System.out.println(n+" "+"is in array");break;
		}
		else {
			System.out.println("Entered num is not present");break;
		}
	}
	
	
}

}
