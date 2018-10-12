
public class Motorcycle extends Vehicle {
	
	public int passengercapacity=1;
	public int numberofseats= 2;

	
	public Motorcycle(String type, int wheels,String colour, int passengercapacity, int numberofseats) { //this is the constructor of the car
		super(type, wheels, colour); //these come from the vehicle constructor so we use super
		this.passengercapacity= passengercapacity; //unique to car 
		this.numberofseats= numberofseats; //unique to car  
		
	}
	
/*	public String toString() {
		return "This " +  this.colour  + Vehicle.type + " has " + Integer.toString(this.wheels) + " wheels. The number of passsengers" + Vehicle.type + "accomodates for is " + this.passengercapacity + "and the numebr of seats this" + Vehicle.type + "has, is" + this.numberofseats ;
}
*/
	}
	
	
