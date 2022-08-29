package java_data_types;

public class Day04switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Monday";
		switch (day) {
		case "Monday" :
			System.out.println("the 1st day of the week");
			break;
		case "Tuesday" :
			System.out.println("the 2end day of the week");
			break;
		case "Wednesday" :
			System.out.println("the 3rd day of the week");
			break;
		case "Thursday" :
			System.out.println("the 4th day of the week");
			break;
		case "Friday":
			System.out.println("the 5th day of the week");
			break;
		case "Saturday":
			System.out.println("the 6th day of the week");
			break;
		case "Sunday":
			System.out.println("the 7th day of the week");
			break;
		default:
			System.out.println("the value is somthing else");
		}
		
		// ends here
		byte age=4;
		switch (age) {
		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		case 3:
			System.out.println("the value is 3");
			break;
		case 4:
			System.out.println("the value is 4");
			break;
		default:
			System.out.println("Error");
		}
		
		// ends here 
		char gender= 'M';
				switch (gender) {
				case 'M':
					System.out.println("the gender is a man");
					break;
				case 'F':
					System.out.println("the gender is woman");
					break;
				default:
					System.out.println("unknown");
					
				
		
		}
	}

}
