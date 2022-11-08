package com.bridgelabz;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseANumberProb4 {
	public static void main(String[] args){
		int n, r=0, rev=0;
		Scanner num =new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=num.nextInt();
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
			System.out.println(rev);
		}
	}
}
