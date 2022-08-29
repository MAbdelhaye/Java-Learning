package java_data_types;

public class Day10_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	String [][] countries= new String[2][2];
	countries [0][0]= "USA";
	countries [0][1]= "UK";
	countries [1][0]= "KSA";
	countries [1][1]= "UEA";
	System.out.println(countries [1][0]);
	
	
	
	// ends here 
	
	int [][] numbers= new int[2][2];
	numbers [0][0]= 10;
	numbers [0][1]= 30;
	numbers [1][0]= 50;
	numbers [1][1]= 80;
	System.out.println(numbers [1][0]);
	
	
	// another way to store values 
	
	String [] [] names = {
			{"moh","ab","mido"},
			{"mike","jhon","david"},
			{"juba","kaka","messi"}	
	};
	System.out.println(names[2][1]);
	for (int row=0 ; row< names.length ; row++) {
		for (int col=0 ; col < names [row].length ; col++) {
			System.out.println(names[row][col]);
		}
			
	}
	}

	
	public static void ArrMethod() {
		int [] [] val = {
			{25,10,33},
			{60,0,88},
			{80,60,56}
		};
		 
		
		
	}
}
