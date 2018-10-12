
public class Runner {


	public static void main(String[] args) {
    printnumbers (); 
    printmorenumbers();
    
    String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}; //strings 

    arrayMethod(numbers); //set of instructions defined for numbers
    
    
 

	}
	 //print numbers 1 to 10
	//define an array then set conditions to print numbers 
	
	public static void printnumbers() {
		
		for(int i=0; i<=10; i++) {
			
		System.out.println(i); 
		
		}
			
		}
	
	public static void printmorenumbers() {
		for(int j=100; j<=1000; j++) {
			System.out.println(j);
		}
	}
		public static String outputmessage(String parameter ) {
			return parameter;
		
		
	}
	
		public static void arrayMethod(String[] numberInput) { //arrayMethod - name of instructions (String[] numberInput - what the method will be applied to)
			
			for(int i=0; i< numberInput.length; i++) { //set of instructions telling machine what to do 
				System.out.println(numberInput[i]);
			}
			
			
		}
	
}

