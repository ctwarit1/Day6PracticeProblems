package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumberProb2 {
	public static void main(String[] args){
		int n, i, j, s=0;
		Scanner num=new Scanner(System.in);
		System.out.print("Enter the number: ");
		n=num.nextInt();
		System.out.println("The factors of numbers are: ");
		for(i=1;i<n;i++)
			if(n%i==0){
				System.out.println(i+" ");
				s=s+i;
				}
		if(s==n)
			System.out.println("Its a perfect number");
		else
			System.out.println("Its not a perfect number");
			}
	}


