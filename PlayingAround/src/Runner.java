
public class Runner {

	public static void main(String[] args) { 
		
		/* NOT THE MOST FEASIBLE AND PRACTICAL WAY! 
		 * String first= new String("one");
		String second= new String("two");
		String third = new String("three");
		String fourth = new String("four");
		String fifth = new String("five");
		String sixth = new String("six");
		String seventh = new String("seven");
		String eighth = new String("eight");
		String ninth = new String("nine");
		String tenth = new String("ten");
		String fifteen = "fifteen ";
		
	
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		System.out.println(fifth);
		System.out.println(sixth);
		System.out.println(seventh);
		System.out.println(eighth);
		System.out.println(ninth);
		System.out.println(tenth);
*/
		 String[] numbers2 = {"one", "two", "three", "four", "five", "six", "seven", "eight"}; //strings
		
        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}; //strings 
		
        arrayMethod(numbers); //set of instructions defined for numbers
        
        arrayMethod(numbers2); //set of instructions defined for string 2
        
        
		
	} //Having a method is important - imagine you had 2 strings, your instructions for i would not work for both so you would have a method - you want to move away from functional computations
	
	public static void arrayMethod(String[] numberInput) { //arrayMethod - name of instructions (String[] numberInput - what the method will be applied to)
		
		for(int i=0; i< numberInput.length; i++) { //set of instructions telling machine what to do 
			System.out.println(numberInput[i]);
		}
		
		
	}
}
