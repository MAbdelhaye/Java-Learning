package java_data_types;

public class Day04_ifNsteadjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=30;
		int b=20;
		int c=10;
		if (a>c && a>b) {
			System.out.println("a is the largest number");
		}else if (b>c) { 
			System.out.println("b is the largest number");
		}else {
			System.out.println("c is the largest number");
		
		}
		
		int x=10;
		int y=55;
		int z=80;
		if (x>z) {
			if(x>y) {
				System.out.println("x is the largest number");
			}else{
				System.out.println("z is the largest number");
			}		
		} else if (y>x) { 
			if (y>z) {
			System.out.println("y is the largest number");
			}
		} else {
			System.out.println("z is the largest number");
		}
		
		
		
		
	
}
			
}


