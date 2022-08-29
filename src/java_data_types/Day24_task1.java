package java_data_types;

public class Day24_task1 {
	
	
	static void task1 (String value) {
		int length = value.length();
		char middle = value.charAt((length)/2);
		if (length%2==1 && length>3) {
			System.out.println("The string has odd numbers of charaters");
			System.out.println("the middle character is : " + middle);	
		} else {
			System.out.println("The string has even numbers of charaters");
		}
	}
	
	static void task2 (String value) {
		int length = value.length();
		char middle1 = value.charAt(((length)/2)-1);
		char middle2 = value.charAt((length)/2);
		if (length%2==0 && length>5) {
			System.out.println("The string has even numbers of charaters");
			System.out.println("the two middle character are : " + middle1+middle2 );	
		} else {
			System.out.println("The string has odd numbers of charaters");
		}
	}
	
	static void  task3(String actualValue, String expectedValue) {
		boolean result = actualValue.equals(expectedValue);
		boolean result2 = actualValue.equalsIgnoreCase(expectedValue);
		if (result==true) {
			System.out.println("both values are equal");
		}else if (result2==true) {
			System.out.println("both values are equal but the characters are diffrent");
		} else {
			System.out.println("Values are not equal");
		}
				
	}

	public static void main(String[] args) {
		task1("Edward");
		task2("Mhamed");
		task3("mmmm","MMMM");	

	}
}
