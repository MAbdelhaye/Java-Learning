package java_data_types;

public class Day09_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;// Declare the variable
		a = 50;// initialize the variable
		// int [] rollNumber; // Decalre the array variable
		// rollnumber = new int [5];

		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 900;
		_rollNumber[2] = 300;
		_rollNumber[3] = 100;
		_rollNumber[4] = 500;

		System.out.println(_rollNumber[2]);

		String[] name = new String[5];
		name[0] = "Aimal";
		name[1] = "Nancy";
		name[2] = "Ali";
		name[3] = "Anya";
		name[4] = "Waqas";

		System.out.println(name[3]);

		// another way

		String[] last_name = { "Aly", "Mike", "Jhon", "Alex", "David" };
		System.out.println(last_name[3]);
		System.out.println(last_name.length);
		for (int i=0 ; i< last_name.length ; i++) {
			System.out.println(last_name[i]);
		}

	}

}
