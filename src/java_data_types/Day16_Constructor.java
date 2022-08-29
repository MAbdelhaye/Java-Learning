package java_data_types;

public class Day16_Constructor {
	
	
	Day16_Constructor() {
		System.out.println("Log in as an Admin");
	}

	
	Day16_Constructor (String name){
		System.out.println("log in as "+ name);
	}
	Day16_Constructor (String name , String env){
		System.out.println("log in as "+ name);
		System.out.println("log in as "+ env);
	}
	
	Day16_Constructor (int val){
		System.out.println("the value is  "+ val);
	}
	void hello() {
		System.out.println("this hello method");
	}
}
