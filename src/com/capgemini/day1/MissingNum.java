package com.capgemini.day1;
import java.util.Scanner;
public class MissingNum {
public static Scanner sc;
public static void main(String[] args) {
int i,n,sum;
sc = new Scanner(System.in);
System.out.println("Enter the array size:");
n = sc.nextInt();
int array[]= new int[n];
System.out.println("Enter the"+n+"numbers of array:");
for(i=0; i<=n-1; i++) {
	array[i] = sc.nextInt();
}
sum = (n*(n+1))/2;
for(i=0; i<n; i++) {
	sum = sum-array[i];
}
System.out.println("The missing num is"+sum);


	}

}
