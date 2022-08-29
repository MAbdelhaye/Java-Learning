package java_data_types;

public class Day19_Thiskeyword {
	int rollNum;
	String name ;
	float fee ; 
	
	
	
	 Day19_Thiskeyword ( int rollNum , String name , float fee ) {
		 rollNum = rollNum;
		 name = name; 
		 fee = fee ; 
		
	}
	
	  void DisplayData() {
		  System.out.println("Roll Num : " + rollNum);
		  System.out.println(" Name : " + name);
		  System.out.println("fee : " + fee);
	  }
}
