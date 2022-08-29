package java_data_types;

import java.util.Scanner;

public class Day07_loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ENTER THE MONTH IN WHICH YOU WEHRE BORN");
		Scanner getInput= new Scanner(System.in);
		int m= getInput.nextInt(); 
		if (m==1) {
			System.out.println("BORN IN WINTER");
		} else {
			System.out.println("error");
		}
	}

}
