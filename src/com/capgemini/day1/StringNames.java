package com.capgemini.day1;
import java.util.*;
public class StringNames {
	public static Scanner sc;
	public static void main (String[]args) {
		sc = new Scanner(System.in);
		String[] users= {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan"};
		String name="";
		System.out.println("Enter name to be searched:");
		name=sc.nextLine();
		int count =0;
		for(int i=0;i<users.length;i++)
		{
			if(users[i].equals(name))
			{
				count++;
				
			}
		}
		if(count>0)
		{
			System.out.print("Found name:"+name+"Occurence:"+count);
		}
		
	}

}
