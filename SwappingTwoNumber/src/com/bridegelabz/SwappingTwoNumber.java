package com.bridegelabz;
import java.util.Scanner;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		int a,b,temp;
		
	System.out.print("Enter two numbers : ");
	Scanner value = new Scanner(System.in);
	a=value.nextInt();
	b=value.nextInt();
	// swaping the numbers
	System.out.println(+a+" "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("Entered numbers have been swapped successfully : "+a+" "+b);
	
	
	
	
		
		 
		
		
		
		

	}

}
