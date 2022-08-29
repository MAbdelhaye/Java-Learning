package java_data_types;

public class Day08_breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a= 0;
		do {
			System.out.println("hello");
			if (a==5) { 
				System.out.println("the value is 5");
				break;
			}
			a++;
		} while (a<10);
	}

}
