package com.capgemini.day1;

public class BubbleSort {
public static void main(String[]args) {
	int a[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	for(int j=0; j<a.length;j++) {
		boolean swapped = false;
		int i=0;
		while(i<15-1) {
			if(a[i]>a[i+1])
			{
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				swapped = true;
			}
			i++;
		}
		if(!swapped)
			break;
	}
	for(int x:a) {
		System.out.println(x);
	}
}
}
