package java_data_types;

 abstract class furniture {
	abstract void color (); 
	abstract void materials();
	abstract void weight();
}

 abstract class chair extends furniture {

	
	void color() {
		System.out.println("This is color method");
		
	}

	void materials() {
		System.out.println("This is material method");
	}

	void weight() {
		System.out.println("This is weight method");
		
	}
}

class brand extends chair {
		void deminsion(){
			System.out.println("This is dimension method");
		}
		void weight() {
			System.out.println("This is weight method");
		}	
	}

public class Day20_Abstract_calss {

	public static void main(String[] args) {
		// indirect obj of class
		chair a = new brand();
		a.color();
		// Direct obj of class
		brand b = new brand();
		b.color();
		b.deminsion();
		b.weight();
		b.materials();
		mobile mm = new mobile ();
		mm.make();
		mm.memory();
		mm.color();
		
		
		
				

	}

}
