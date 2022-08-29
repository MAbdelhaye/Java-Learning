package java_data_types;



public class Day21_practice {
	

	void method1  () {
		System.out.println("This is method 1");
	}

}


class child1 extends Day21_practice{
	
	void method2 () {
		System.out.println("This is method 2");
	}
}

class grandchild extends child1 {
	void method3 () {
		System.out.println("This is method 3");
	}
}
