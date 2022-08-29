package java_data_types;

import java.util.Scanner;

public class Day18_Task {

	public static void main(String[] args) {
		
		SumMethod();
		
		
		}
		
	
	
	static void SumMethod() {
		System.out.println("How many values you need to calculate");
		Scanner getInput = new Scanner (System.in);
		int a = getInput.nextInt();
		System.out.println("Enter the Operation");
		String opr = getInput.next();
		if (opr.equals("+")) {
		int [] arr = new int[a];
		int sum = 0; 
		for (int i =0 ; i< arr.length ; i++) {
			System.out.println("Enter the " + (i+1)+ " value");
			arr [i]= getInput.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("The sum of the values");
		for (int i =0 ; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Equal to "+ sum);
		} else {
			System.out.println("error");
		}
		
		
	}

}
