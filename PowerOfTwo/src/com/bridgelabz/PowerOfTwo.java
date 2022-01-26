package com.bridgelabz;
import java.util.Scanner;


public class PowerOfTwo {
	public static void calcPowerOfTwo(int N) {
		int power=1;
		if (N>=0 && N<=31) {
			for (int i=0; i<=N; i++) {
		System.out.println("2^" +i + "="+ power);
		power=(2* power);}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the limit :");
		int N =sc.nextInt();
		
		// read input using command line argrument to integer
		
		calcPowerOfTwo(N);
	}

}
