package java_data_types;


abstract class Marks {
	abstract double getPrecentage();
}

class StudentA extends Marks {
	 double subj1;
	 double subj2;
	 double subj3;
	 
	StudentA(double subj1 , double subj2, double subj3){
		this.subj1=subj1;
		this.subj2=subj2;
		this.subj3=subj3;	
	} 
	double getPrecentage() {
		double percentage= (subj1+subj2+subj3)/3;
		return percentage;		
	}		
}
class StudentB extends Marks{
	
	 double subj1;
	 double subj2;
	 double subj3;
	 double subj4;
	
	StudentB(double subj1 , double subj2 , double subj3 , double subj4){
		this.subj1=subj1;
		this.subj2=subj2;
		this.subj3=subj3;
		this.subj4= subj4;
	}
		
	double getPrecentage() {
		double percentage= (subj1+subj2+subj3+subj4)/4;
		return percentage;	
	}	
}

public class Day22_Task3 {
	
	public static void main(String[] args) {
		StudentA sa = new StudentA(40,60,55);
		System.out.println("The percentage of Student A : "+sa.getPrecentage()+ " %");
		StudentB sb = new StudentB(40,60,55,90);
		System.out.println("The percentage of Student A : "+sb.getPrecentage() +" %");
		
		

	}

}
