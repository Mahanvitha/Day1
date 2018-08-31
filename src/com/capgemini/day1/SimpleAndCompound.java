package com.capgemini.day1;
import java.util.Scanner;
import java.lang.Math;

public class SimpleAndCompound {
public static Scanner scan;
public static void main(String[]args) {
	double p,t,r,sim,comp;
	scan = new Scanner(System.in);
	System.out.println("Enter principle:");
	p = scan.nextDouble();
	System.out.println("Enter time");
	t = scan.nextDouble();
	System.out.println("Enter rate");
	r = scan.nextDouble();
	sim = (p*t*r)/100;
	comp = (double) ((p*(Math.pow((1+(r/100)),t)))-p);
	System.out.println("simple and compound interest for given values are:"+sim+","+comp);
}

}
