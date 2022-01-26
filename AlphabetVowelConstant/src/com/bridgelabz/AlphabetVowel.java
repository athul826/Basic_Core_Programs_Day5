package com.bridgelabz;
import java.util.Scanner;

public class AlphabetVowel {

	public static void main(String[] args) {
		 char ch;
	        System.out.println("ENTER A CHARACTER :");
	        Scanner letter =new Scanner(System.in);
	        ch=letter.next().charAt(0);
	        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
	            System.out.print("is vowel");
	        }
			else

	        {
	            System.out.println("is consonant");

		}
		
		

	}

}
