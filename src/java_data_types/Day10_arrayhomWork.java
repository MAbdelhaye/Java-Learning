package java_data_types;

import java.util.Scanner;

public class Day10_arrayhomWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("HOW MANY VALUES YOU WANT TO SUM");
		Scanner getInput= new Scanner(System.in);
		int a = getInput.nextInt();
		int [] arr = new int [a];
		int sum =0;
		for (int i=0 ; i < arr.length ; i++) {
			System.out.println("ENTER THE" + (i+1)+" VALUES");
			arr [i] = getInput.nextInt();
			sum = sum + arr[i];	
		}
		System.out.println("the sum is " + sum);	
	 }
}
