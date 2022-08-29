package java_data_types;

import java.util.Scanner;

public class Day07_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner montheIndex= new Scanner(System.in);
		for (int i=0 ; i<3 ; i++) {
	
			System.out.println("ENTER THE MONTH IN WHICH YOU WEHRE BORN");
			System.out.println("FOR EXAMPLE ENTER (Jan) FOR JANUARY");
		String m = montheIndex.next();
		 
		if (m.equals("Jan")|| m.equals("Feb") || m.equals("Mar")) {
			System.out.println("BORN IN WINTER");
		} else if (m.equals("Apr")|| m.equals("May") || m.equals("Jun")) {
			System.out.println("BORN IN SPRING ");
		} else if (m.equals("Jul")|| m.equals("Aug") || m.equals("Sep")) {
			System.out.println("BORN IN SUMMER ");
		} else if (m.equals("Oct")|| m.equals("Nov") || m.equals("Dec")) {
			System.out.println("BORN IN Fall ");
		} else {
			System.out.println("Error");
		
		
	  }
	}
  }
}
