package com.capgemini.day1;
import java.util.Scanner;
public class IncomeTax {
public static Scanner sc;
public static void main(String[]args) {
	double ctc,tax;
	sc = new Scanner(System.in);
	System.out.println("Enter the CTC:");
	ctc = sc.nextDouble();
	if(ctc>=0 && ctc<=180000) {
		tax = ctc;
		System.out.println("Tax Payable is nill");
	}
	if(ctc>=181000 && ctc<=300000) {
		tax = ctc/10;
		System.out.println("tax payable amount is:"+tax);
	}
	if(ctc>300000 && ctc<=500000) {
		tax = ctc/5;
		System.out.println("tax payable amount is:"+tax);
	}
	if(ctc>=500001 && ctc<=1000000) {
		tax = ctc*3/10;
		System.out.println("Tax payable amount is:"+tax);
	}
	
	
}

}
