package packageOne;

import packageTwo.ClassThree;

public class ClassOne {
	public int a1=10;
	int c1=90;
	

	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodOne();
		System.out.println(c1.a1);
		ClassThree c3 = new ClassThree();
		
		
		
		

	}
	 public static void methodOne() {
		 System.out.println("This is method 1. ");
	 }
	 
	  static void methodSeven() {
		 System.out.println("This is method seven");
	 }
}
