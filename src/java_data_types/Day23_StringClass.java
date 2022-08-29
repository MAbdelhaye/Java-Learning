package java_data_types;

public class Day23_StringClass {

	public static void main(String[] args) {
		String StringOne = new String ("My name is Mohamed");
		String StrnigTwo = "I Don't care at all";
		System.out.println("String length is : "+StringOne.length());
		System.out.println("String length is : "+ StrnigTwo.length() );
		
		String StringThree = new String ("TRY TO NOT MAKE ANY MISTAKE");
		String StingFour = new String ("try to not make any mistake");
		System.out.println(StringThree.toLowerCase());
		System.out.println(StingFour.toUpperCase());
		boolean returnOne = StringOne.equals(StrnigTwo);
		System.out.println(returnOne);
		boolean returnTow = StringThree.equalsIgnoreCase(StingFour);
		System.out.println(returnTow);
		int resultOne = StringThree.compareTo(StingFour);
		int resultTow = StringThree.compareToIgnoreCase(StingFour);
		System.out.println(resultOne);
		System.out.println(resultTow);
		String combine = StringOne.concat(StrnigTwo);
		System.out.println(combine);
		
	}

}
