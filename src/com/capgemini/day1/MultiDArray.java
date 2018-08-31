package com.capgemini.day1;
import java.util.Scanner;
public class MultiDArray{
public static Scanner sc;

    public static void main(String[] args) {
    	int row,col,toFind;
        
        sc = new Scanner(System.in);
        System.out.println("Enter the no.of.rows:");
        row = sc.nextInt();
        System.out.println("Enter the no.of.col:");
        col = sc.nextInt();
        int num[][] = new int[row][col];
        for(int i=0;i<row;i++) 
        {
        	System.out.println("Enter the elements of"+(i+1)+"row");
        for (int j=0;j<col;j++) 
        {
            num[i][j] = sc.nextInt();
        }
       }
        System.out.println("Enter the number to be searched:");
        toFind = sc.nextInt();
        for(int i=0;i<row;i++) 
        {
        for (int j=0;j<col;j++)
        {
        if(num[i][j]==toFind)
        {
        System.out.println("The number is found at"+row+" "+col);
        }
        	
        }
    }
}
}



    
        	
        	
        	
        	
        	
       

    