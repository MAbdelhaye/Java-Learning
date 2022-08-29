package java_data_types;

abstract class bank {
	abstract int getBalance(int deposite);
	
}

class BankA extends bank {

	int getBalance(int deposite) {
		return deposite;
		
	}
}

class BankB extends bank {

	int getBalance(int deposite) {
		return deposite;
		
	}	
}

class BankC extends bank {
	int getBalance(int deposite) {
		return deposite;
		
	}
	
	
}

public class Day22_task2 {

	public static void main(String[] args) {
		BankA a = new BankA();
		
		System.out.println("The deposite in Bank A is : "+a.getBalance(100));
		BankB b = new BankB();
		System.out.println("The deposite in Bank B is : "+b.getBalance(150));
		BankC c = new BankC();
		System.out.println("The deposite in Bank B is : "+c.getBalance(200));

	}

}
