import java.util.ArrayList;

public abstract class Vehicle {

	//build attributes. First thing you need is an access modifier
	
	public  String type;
	public int wheels;
	public String colour;
	
	public Vehicle(String type, int wheels,String colour) {
		this.type= type;
		this.wheels= wheels; 
		this.colour =  colour; 
		
	}
	
	/*public String toString() {
		return "This " +  this.colour  + Vehicle.type + " has " + Integer.toString(this.wheels) + " wheels";
		}
		*/

	public void move() {
		
		System.out.println("This" + this.type + "is in motion");
	}
	
	
	public void steer() {
		System.out.println("This" + this.type + "can move left and right");
		
	}
	public String twoString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
