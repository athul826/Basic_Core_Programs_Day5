package com.bridgelabz;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("enter year :");
		Scanner check=new Scanner(System.in);
		year=check.nextInt();
		if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
		

	}

}
