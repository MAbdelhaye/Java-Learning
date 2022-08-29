package java_data_types;

public class Day18_MethodOverrideChild extends Day18_MethodOverrideParent {

	public static void main(String[] args) {
		
		Day18_MethodOverrideChild aa = new Day18_MethodOverrideChild();
		aa.Openbrowser();
	}

	
     public void Openbrowser () {
		System.out.println("Open Firefox browser");
		System.out.println("Visite the web site");
		System.out.println("Enter user name");
		System.out.println("Enter password");
     }
}
