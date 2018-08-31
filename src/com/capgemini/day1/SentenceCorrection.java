package com.capgemini.day1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class SentenceCorrection {
public static Scanner sc;
public static void main(String[]args)throws IOException 
{
	sc =new Scanner(System.in);
	int i;
	System.out.println("Enter the sentence:");
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String sentence = in.readLine();
	String[]words = sentence.split(" +");
	int length = words.length;
	System.out.println("Word to be deleted");
	String deleteWord = sc.nextLine();
	System.out.println("Word position in the sentence:");
	int position = sc.nextInt();
	for(i=0;i<length;i++) {
		if(words[i].equals(deleteWord))
		{
			if(i==position-1)
			{
				continue;
			}
			System.out.print(words[i]+" ");
		}
		else
		{
			System.out.print(words[i]+" ");
		}
	}
	
	
}

}
