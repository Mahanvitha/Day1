package com.capgemini.day1;
import java.util.Scanner;
public class AvgMarks {
public static Scanner sc;
public static void main(String[] args) {
		
		int marks[][] = new int[3][3];
		sc = new Scanner(System.in);
		for(int i=0; i<3; i++) 
		{
			System.out.println("Enter the marks of student" + (i+1));
			for(int j=0;j<3;j++)
		{
				marks[i][j]=sc.nextInt();
		}
		}
			int stdavg[]= new int[3];
			int subavg[]= new int[3];
			int stdtotal[]= new int[3];
			int subtotal[]= new int[3];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					subtotal[j] = subtotal[j] + marks[i][j];
				}
			}
			for(int i=0;i<3;i++) {
				System.out.println("Total Subject marks in sub" +(i+1)+"is"+ subtotal[i]);
				subavg[i]=subtotal[i]/3;
				System.out.println("Averagemarks in sub" +(i+1)+"is"+subavg[i]);
			}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				stdtotal[i]=stdtotal[i]+marks[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("Total Subject marks in sub" +(i+1)+"is"+ stdtotal[i]);
			subavg[i]=subtotal[i]/3;
			System.out.println("Averagemarks in sub" +(i+1)+"is"+stdavg[i]);
		}
}
}
