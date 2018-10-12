
public class Runner {

	public static void main(String[] args) {
		
		System.out.println(name());
		System.out.println(nametwo());
	}
	
	
	public static String name() { //anything with public static etc is a method 
		String name = "Feroza";
		if (name.equals("Feroza")) {
			return "true";
		}
		else {
			return "false";
		}
	}

	
	public static String nametwo() { //anything with public static etc is a method 
		String nametwo = "Feroza";
		String name = "Feroza";
		if (nametwo.equals(name)) {
			return "true";
		}
		else {
			return "false";
		}
	 
	
}
}
