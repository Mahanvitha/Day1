package com.capgemini.day1;

public class ArmsNum {
public static void main(String[]args) {
	int num, sum =0,rem,i;
	for(i=100;i<=999;i++) {
		num =i;
		while(num>0) {
			rem = num% 10;
			sum = sum+(rem*rem*rem);
			num =num/10;
		}
		if(sum == i) {
			System.out.println(i);
		}
		sum =0;
	}
}
}
