package java_data_types;

abstract class phoneParent {
	 abstract void make();
	 abstract void memory();
	 abstract void  color();
	 	
}

 abstract class phoneChild extends phoneParent  {


	void make() {
		System.out.println("This is make method");	
	}
	
	
}
 
 class mobile extends phoneChild{
	 
	void memory() {
		System.out.println("This is memory method");	
	}

	void color() {
		System.out.println("This is color method");	
	}
 }
 	

public class Day20_task_Abstract_class {

	public static void main(String[] args) {
		mobile m = new mobile();
		m.color();
		m.make();
		m.memory();
		

	}

}
