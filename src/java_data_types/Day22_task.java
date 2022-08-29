package java_data_types;

abstract class shape {
	abstract double RectagleArea (double length , double width);
	abstract double squarArea(double side);
	abstract double CircleArea(double r);
}


class Area extends shape  {

	double RectagleArea(double length, double width) {
		double ra = length * width ;
		return ra;
			
	
	}
	double squarArea(double side) {
		double sa = side * side;
		return sa;
	}
		

	double CircleArea(double r) {
		double ca =r*3.14*r ;
		return ca;
	}
	
	
}

public class Day22_task {
	
	public static void main(String[] args) {
		Area aa = new Area();
		System.out.println("The rectangle Area is : "+ aa.RectagleArea(15.5, 10.3));
		System.out.println("The squar Area is : "+ aa.squarArea(5.5));
		System.out.println("The circle Area is : "+ aa.CircleArea(6.5));
		
		
	}

}
