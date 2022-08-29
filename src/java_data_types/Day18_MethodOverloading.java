package java_data_types;

public class Day18_MethodOverloading {

	public static void main(String[] args) {
		
	
		addition (10,20);
		addition (10,20,30);
		addition(10, 50f);
		

	}
	// method overloading by changing the number of parameter
	static void addition (int a, int b) {
		System.out.println(a+b);
	}
	static void addition (int a, int b , int c ) {
		System.out.println(a+b+c);
	}
	static void addition (int a, float b) {
		System.out.println(a+b);
	}

}
