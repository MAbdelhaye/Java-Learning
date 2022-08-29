package java_data_types;

public class Day09_practice_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] x = new int[7];
		x[0]=10;
		x[1]=150;
		x[2]=165;
		x[3]=180;
		x[4]=189;
		x[5]=198;
		x[6]=19;
		
		System.out.println(x[3]);
		for (int i=0; i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		int [] b= {100,200,850,56,71,89};
		System.out.println(b[2]);
		
		// to know the length of an array 
		System.out.println(b.length);
		System.out.println(x.length);
		for (int i=0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		
		
		
	}

}
