package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumberProb3 {
public static void main(String[] args){
	int n, i;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter a number to know wheather its a prime or not: ");
	n=num.nextInt();
	for(i=2;i<=n/2;i++) 
		if(n%i==0) 
			System.out.println("Entered number is not a prime number");
			
		else 
			System.out.println("Entered number is a prime number");
	
		
		
	}
}

