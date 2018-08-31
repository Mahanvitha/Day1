package com.capgemini.day1;

import java.util.Scanner;

public class Mysq1{
	public static Scanner scan;
	public static void main(String[] args) {
		int num,sq;
		scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		num=scan.nextInt();
		sq=num*num;
		System.out.println(num+"*1="+num+" "+sq);

	}

}
