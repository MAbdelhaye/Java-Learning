package java_data_types;

public class Day16_PracticeVariables {
	
	String name = "Mohamed";
	String job = "Engineer";
	int age = 33;
	static double salary = 1500.26 ;

	public static void main(String[] args) {
		Day16_PracticeVariables moh = new Day16_PracticeVariables();
		System.out.println(moh.name);
		System.out.println(moh.job);
		System.out.println(moh.age);
		System.out.println(moh.salary);
		
		moh.job = "tester";
		moh.age= 55;
		moh.name = "mike";
		System.out.println(moh.job);
		System.out.println(moh.age);
		System.out.println(moh.name);
		moh.salary = 5000.55;

		
		Day16_PracticeVariables aa = new Day16_PracticeVariables();
		aa.infoMethod();
	}

	public static void infoMethod () {
		System.out.println("This is infoMethod");
		Day16_PracticeVariables mike = new Day16_PracticeVariables();
		System.out.println(mike.salary);
	}
}
