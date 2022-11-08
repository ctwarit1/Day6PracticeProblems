package com.bridgelabz;

import java.util.Scanner;

public class SimulateStopwatchprob6 {
	public static void main(String[] args){
		int n, start, stop;
		Scanner press=new Scanner(System.in);
		System.out.println("Press 0 to start the stopwatch ");
		n=press.nextInt();
		start= (int) System.currentTimeMillis();
		System.out.println(start);
		System.out.println("Press 1 to stop the stopwatch ");
		n=press.nextInt();
		stop=(int) System.currentTimeMillis();
		System.out.println(stop);
		int elapsed= stop - start;
		System.out.println("Elapsed time is: "+elapsed);

	}

}
