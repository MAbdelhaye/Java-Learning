package packageOne;

class ClassFour {
	public int a4=50;
	private int b4=80;
	
	
}


public class ClassTwo {
	public int a2=20;
	
	
	public static void main(String[] args) {
		ClassOne c2= new ClassOne();
		c2.methodOne();
		System.out.println(c2.a1);
		ClassOne c1 = new ClassOne();
		c1.methodSeven();
		System.out.println(c1.c1);
		
				
	}
	public static void methodTwo() {
		System.out.println("This is method 2. ");
	}
}
