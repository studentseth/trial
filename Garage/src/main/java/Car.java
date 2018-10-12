
public class Car extends Vehicle { //inherits attributes and methods of vehicle
	
	public int wipers;
	public int numberofexhausts;
	
	public Car(String type, int wheels,String colour, int wipers, int numberofexhausts) { //this is the constructor of the car
		super(type, wheels, colour); //these come from the vehicle constructor so we use super
		this.wipers= wipers; //unique to car 
		this. numberofexhausts= numberofexhausts; //unique to car  
		
	}

}
