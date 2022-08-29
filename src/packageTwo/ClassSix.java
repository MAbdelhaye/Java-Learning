package packageTwo;

public class ClassSix {

	public static void main(String[] args) {
	
		int value [] = {2,5,0,3,-1,88,96,100};
	
		int small = value[6];
		for (int i=0 ; i < value.length ; i++) {
			
			if ( value[i]<small) { 
				small= value[i];
				
			}
		
		}
		System.out.println(small+ " is the smallest");
	}

}
