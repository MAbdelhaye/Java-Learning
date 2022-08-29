package java_data_types;

public class Day15_LocalVariables {
 // Global variable will be written inside the class and outside any method 
	// the better we write them on top to avoid confusion
		String Day = "Monday";
	public static void main(String[] args) {
		// Local variable 
		int age= 10;
		String name = "mike";
		float temp = 58.65f;
		System.out.println(age);
		System.out.println(name);
		System.out.println(temp);
		
		Day15_LocalVariables a = new Day15_LocalVariables ();
		a.possible();
		
		
		
	}
 
	public static void possible() {
		// every variable created inside this method will be accessible just here
		String email= "aaaa@gmail.com";
		String name = "roby";
		String password = "abcd";
		System.out.println(email);
		System.out.println(name);
		System.out.println(password);
		
	}
}
