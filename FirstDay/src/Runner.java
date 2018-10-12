
public class Runner {
	
	//Call methods here:

	public static void main(String [] args) {
		
	 
		System.out.println("Hello World!");
		System.out.println(message());
		System.out.println(outputmessage("Hello World!"));
		
	}
	//Define the methods here: 
	
	public static String message() { //anything with public static etc is a method 
		return "Hello World!";
		
	}
	public static String outputmessage(String parameter ) {
				return parameter;
}
	
}
 