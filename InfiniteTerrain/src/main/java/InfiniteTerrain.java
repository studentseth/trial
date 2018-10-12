import java.util.Scanner;

public class InfiniteTerrain {
 



	static Scanner input = new Scanner(System.in); //allows us to type in something 
	
		
		static int xPosition = 0;
		static int yPosition = 0;
	
	public static void move() {
		System.out.println("Choose your move");
		String command = input.nextLine();
		System.out.println(command);

		switch (command) {
		

		case "north":
			yPosition = yPosition + 1;
			System.out.println("(" + xPosition + "," + yPosition + ")");

			break;

		case "east":
			xPosition = xPosition + 1;
			/* System.out.println("move right"); */
			System.out.println(xPosition);
			System.out.println("(" + xPosition + "," + yPosition + ")");
			break;

		case "south":
			yPosition = yPosition = -1;
			System.out.println("move down");
			System.out.println("(" + xPosition + "," + yPosition + ")");
			break;

		case "west":
			xPosition = xPosition - 1;
			System.out.println("move left");
			System.out.println("(" + xPosition + "," + yPosition + ")");
			break;

		}
	}

}
