import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		//collection();
		//listmethod();
		multiplyingmethod(); 

		// call the method

	}

	public static void collection() {

		int[] numbers = new int[101];// one of 2 ways to define an array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			// System.out.println(i);
			System.out.println(numbers[i]);

		}
	}

	public static void listmethod() {
		List<Integer> numberlist = new ArrayList<Integer>();
		for (int i = 100; i < 1000; i++) {

			numberlist.add(i); //adds something to the list,
			
			System.out.println(numberlist.get(i - 100));
		}


	}

	public static void multiplyingmethod() {
		List<Integer> anotherlist = new ArrayList<Integer>(); //create a list
		for(int i=100; i<1000; i++) { //for loop as before 
			anotherlist.add(i*10); //add to list
			System.out.println(anotherlist.get(i-100)); //return values of j 

		}
	}
	

}
