package java_data_types;

import java.util.Scanner;

public class Day27_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("THE PROGRAM STARTED");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value of a ");
		int a = sc.nextInt();
		System.out.println("The value of a is : " + a);
		System.out.println("Enter The value of b ");
		int b = sc.nextInt();
		System.out.println("The value of b is : " + b);
		try {
		int c = a/b;
		System.out.println("The division is : "+ c);
		System.out.println("The program Ended");
	} catch (Exception e ) {
		System.out.println(e.getMessage());	
	}
  }
}
