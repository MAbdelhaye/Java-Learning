package java_data_types;

public class Day03_ifconditionjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if Statement
		if(2==2) {
			System.out.println("the value is 2");
		}
		System.out.println("after the if statement");
	// false statement
		if (2==3) {
			System.out.println("the value is not 2");
		}
		
		int z = 50;
		if (z==50) {
			System.out.println("the value of a is 50");
		} else { 
			System.out.println("the value of a is not 50");
		}	
	double x=30;
	double y=50;
	if (x==y) { System.out.println("x equal to y");
	} else { System.out.println("x is not equal to y");}
	
	byte m=8;
	if (m<0) {
		System.out.println("the value of m is negative");}
	else { System.out.println("the value of m is positive");
	}
	
	String u="Tuesday";
	if(u=="Monday") {
		System.out.println("today is Monday");}
	else if (u=="Tuesday") {
		System.out.println("today is Tuesday");}
	else if (u=="wednesday") {
		System.out.println("today is wednesday");}
	else if (u=="Thursday") {
		System.out.println("today is Thuesday");}
	else if (u=="Friday") {
		System.out.println("today is Friday");}
	else if (u=="Saturday") {
		System.out.println("today is Saturday");}
	else if (u=="Subday") { 
		System.out.println("today is Sunday");}
	else {System.out.println("Error");
	
	}
		
  }
	
}
