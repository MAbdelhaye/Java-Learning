package java_data_types;

public class Day25_StringMethods {
	
	
	static void replace () {
		String sentance = "I love practicing java durnig my free time";
		String sentance2 = "ABDCKLM96358421nnooklysy&%$@#";
		System.out.println(sentance.replaceAll("love", "like"));
		System.out.println("This will not print numbers"+sentance2.replaceAll("[0-9]", ""));
	}
	
	
	
	
	

	public static void main(String[] args) {
		replace();

	}

}
