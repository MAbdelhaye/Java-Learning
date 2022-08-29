package java_data_types;

public class Day15_GlobalVariables {
	String phone= "iphone13";
	String color = "Black";
	static int memory = 32;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day15_GlobalVariables stevephone = new Day15_GlobalVariables();
		System.out.println(stevephone.phone);
		System.out.println(stevephone.color);
		System.out.println(stevephone.memory);
		
		Day15_GlobalVariables jhone = new Day15_GlobalVariables();
		jhone.phone = "iphone13";
		jhone.color = "yelow";
		jhone.phone = "iphone14";
		jhone.memory = 64;
		System.out.println(jhone.phone);
		System.out.println(jhone.color);
		System.out.println(jhone.memory);
		
		Day15_GlobalVariables mikephone = new Day15_GlobalVariables();
		mikephone.possible();
		

	}
	
	public static void possible() {
		Day15_GlobalVariables mikephone = new Day15_GlobalVariables();	
		mikephone.color= "glod";
		mikephone.phone = "samsung";
		System.out.println(mikephone.phone);
		System.out.println(mikephone.color);
		System.out.println(mikephone.memory);
	}
}
