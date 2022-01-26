package com.bridgelabz;
import java.util.Scanner;


public class QuotientReminder {

	public static void main(String[] args) {
	Scanner num = new Scanner (System.in);
	System.out.println("ENTER DIVIDEND :");
	int divident=num.nextInt();
	System.out.println("ENTER DIVISOR :");
	int divisor = num.nextInt();
	
	
	
	int quotient=divident / divisor;
	int remainder =divident % divisor;
	System.out.println("quotient ="+ quotient + "\nreminder = "+ remainder);

	}

}
