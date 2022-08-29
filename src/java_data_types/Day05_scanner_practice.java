package java_data_types;

import java.util.Scanner;

public class Day05_scanner_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput= new Scanner(System.in);
		System.out.println("enter the first value");
		int x = getInput.nextInt();
		System.out.println("enter the second value");
		int y = getInput.nextInt();
		int z= x + y ; 
		System.out.println("the sume is "+ ' '+ z);
		
	
	
	// Ends here
	
	
		System.out.println("enter your first name");
		String first_name= getInput.next();
		System.out.println("enter your last name");
		String last_name = getInput.next();
		String full_name = last_name + first_name ;
		System.out.println("your full name is "+ ' '+ full_name);
		
		// ends here 
		
		System.out.println("enter the first number");
		double v1= getInput.nextDouble();
		System.out.println("enter the second number");
		double v2= getInput.nextDouble();
		if (v1>v2) {
			System.out.println("v1 is the largest number");
		} else if (v2>v1) {
			System.out.println("v2 is the largest number");
			
		}else {
			System.out.println("v1 and v2 are equal");
		}
				
		
		
		
		

	

	

	}

}

