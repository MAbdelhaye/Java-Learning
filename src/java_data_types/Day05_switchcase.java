package java_data_types;

import java.util.Scanner;

public class Day05_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object / instance of the class
		// calssname objectname= new classname;
		
		Scanner getInput = new Scanner (System.in);
		// getInput is the object of scanner class.

		System.out.println("enter the first value");
		//scanner class has methods which takes the int value as input
		 int x = getInput.nextInt();
		 System.out.println("enter the second value");
		 int y =getInput.nextInt();
		 int z=x+y;
		 System.out.println("the sum is"+' '+z);
	}

}
