package java_data_types;

public class Phone {
	int IMEI;
	String make;
	String model;
	String color;
	int memory;
	String camera;
	
	
	void makecall() {
		System.out.println("IMEI :" + IMEI + "\nmake :" + 
				make + "\nmodel : " + model+ "\ncolor : " + color +
				"\nmemory : " + memory+ "\ncamera : " + camera );
	}
	

}
