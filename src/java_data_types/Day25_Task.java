package java_data_types;

public class Day25_Task {
	
	static String task1(String sentence) {
		System.out.println("Print without space : " + sentence.replaceAll(" ", ""));
		return sentence.replaceAll(" ", "");
	}
	
	static int task2(String sentence) {
		String sentence2 = sentence.replaceAll("[A-za-z0-9]", "");
		System.out.println("The number of special characters is : " + sentence2.length());
		return sentence2.length();
	}
	
	static void task3(String sentence) {
		String [] splitword = sentence.split("\\.");
		System.out.println("This sentence has "+ splitword.length +" sentences");
	}
	

	public static void main(String[] args) {
		task1("I love practicing java during my free time");
		task2("ABDCKLM96358421nnooklysy&%$@#");
		task3("Today is a good day. It is Thursday. We have a Java Class.");
		

	}

}
