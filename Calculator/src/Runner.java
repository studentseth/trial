
public class Runner {
	
	int num1 = 1;
	int num2= 2;

			

	//call methods here:
	public static void main(String[] args) {
	
		System.out.println(combination(1, 2, "*"));
		
		/*System.out.println(add(1,2));
		System.out.println(subtract(1,2));
		System.out.println(multiply(1,2));
		System.out.println(divide(1,2));
		*/




		}
	
		/*public static int add(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
		}

		public static int subtract(int num1, int num2) {
		int num4 = num1 - num2;
		return num4;
		}

		public static int multiply(int num1, int num2) {
		int num5 = num1*num2;
		return num5;
		}

		public static double divide(double num1, double num2) {
		double num6 = num1/num2;
		return num6;
		} 
		*/	
	public static double combination(double num1, double num2, String sign ) {
		
	if (sign.equals("+")) {
		return num1+num2;
	}
	else if (sign.equals("-")) {
			return num1-num2;
		}
	else if (sign.equals("*"))  {
				
				return num1*num2;
			}
			
	else if(sign.equals("/")) {
				return num1/num2; 
			}
	else {return 0;
	
	}
}
}


