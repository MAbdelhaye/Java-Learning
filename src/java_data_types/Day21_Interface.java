package java_data_types;
// Example of 100% abstraction
interface example {
	void test();
	void test2 ();
	void test3();
}

class example2 implements example {

	public void test() {
		System.out.println("Ths is test method");
		
	}

	public void test2() {
		System.out.println("Ths is test2 method");
		
	}

	public void test3() {
		System.out.println("Ths is test3 method");
		
	}
	
}
public class Day21_Interface {

	public static void main(String[] args) {
		// example is an Interface and example2 is class and we creared and obj indirectly
		example ee = new example2();
		ee.test();
		ee.test2();
		ee.test3();
		// Direct way to create an obj
		example2 bb = new example2();
		bb.test();
		bb.test2();
		bb.test3();

	}

}
