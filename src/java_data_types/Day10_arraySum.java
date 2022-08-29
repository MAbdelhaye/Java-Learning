package java_data_types;

public class Day10_arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numbers= {1,2,3,4,5,6,7};
		int sum=0;
		for (int a=0; a<numbers.length ; a++) {
			sum=sum+numbers[a];
		}
		System.out.println(sum);
	}

}
