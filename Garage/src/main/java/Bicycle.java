
public class Bicycle extends Vehicle {

	public String seatmaterial;
	
	public Bicycle(String type, int wheels,String colour, String seatmaterial) { //this is the constructor of the car
		super(type, wheels, colour); //these come from the vehicle constructor so we use super
		this.seatmaterial =  seatmaterial; 
		

}
}
