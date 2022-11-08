package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeriesProb1 {
	public static void main(String[] args){
		int n, f, i=0;
		int a=0, b=1;
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number till you want FIBONACCI SERIES: ");
		n=num.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<=n;i++) {
			f=a+b;
			a=b;
			b=f;
			System.out.println(f);
		}
			
	}
}

