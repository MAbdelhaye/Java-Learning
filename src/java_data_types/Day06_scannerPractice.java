package java_data_types;

import java.util.Scanner;

public class Day06_scannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CALCULATOR 
		
		System.out.println("WELCOME TO CALCULATOR PROG");
		Scanner getInput= new Scanner(System.in);
		System.out.println("Enter the first value");
		double a= getInput.nextDouble();
		System.out.println("Enter tye operation");
		char o= getInput.next().charAt(0);
		System.out.println("Enter the second value");
		double b= getInput.nextDouble();
		if (o =='+') {
			System.out.println("The result is ="+(a+b));
		} else if (o == '-') {
			System.out.println("The result is  ="+(a-b));
		} else if (o =='*') {
			System.out.println("The result is  ="+(a*b));
		} else if (o == '/') {
			System.out.println("The result is  ="+(a/b));
		} else {
			System.out.println("Error");
		
			
			
		}
		
		

	}

}
