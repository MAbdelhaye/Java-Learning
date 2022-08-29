package java_data_types;

public class Day12_Methodes {

	public static void main(String[] args) {
		name();
		name2("Jhon");
		name3("Mike",32);
		String a = day();
		System.out.println(a);
		String b= month();
		System.out.println(b);
		int y= age();
		System.out.println("your age is  " + y);
		
		String value = topic("void and non void methods");
		System.out.println(value);

	}
	// non void method with parameter
	public static String topic(String a) {
		return "Today we are learning methods"+a;
	}
	
	
	
	
	// Method without parametr
	public static void name() {
		System.out.println("My name is Mohamed");
	}
	// Method with parametr 
	public static void name2 (String a) {
		System.out.println("My name is "+a);
	}
	public static void name3(String name ,int age) {
		System.out.println(name+" is "+age+" years old ");
	}
	
	// Method with return value
	
	public static String day() {
		String todaysDay="Tuesday";
		return todaysDay;
	}
	// Another way 
	public static String month() {
		return "Augest";
		
	}
	public static int age() {
		int x= 57;
		return 57;
	}
}
