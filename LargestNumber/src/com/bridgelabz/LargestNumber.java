package com.bridgelabz;
import java.util.Scanner;

public class LargestNumber {
	


	public static void main(String[] args) {
		
	
		int num1, num2,num3;
		System.out.println("enter three numbers :");
		Scanner value= new Scanner(System.in);
		num1=value.nextInt();
		num2=value.nextInt();
		num3=value.nextInt();
		if (num1>num2 & num1>num3)
		{
			System.out.println("greatest value is"+ num1 );
		}
		else if (num2>num1 & num2>num3)
		{
			System.out.println("gretest value is"+ num2);
		
			
		}
		else {
			System.out.println("greatest value is "+num3);
		}
	}	
}
	
	