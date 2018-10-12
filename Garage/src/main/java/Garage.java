import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

//use list implementation to store all vehicles in Garage class
//create a method that iterates through each vehicle, calculating a bill for each type of vehicle in a different way, depending on type of vehicle it is
//should have methods that add vehicle, remove vehicle by ID, vehicle type, calculate bill and empty garage
public class Garage {

	private List<Object> garageList; //Create 

	public Garage() {
		garageList = new ArrayList<>(); //new list called garage list
	}

	public void addToGarage(Object vehicle) { //create method called add to garage 
		this.garageList.add(vehicle);
	}

	public List<Object> getGarageList() {
		return garageList;
		
	}
	
	//bill
	public  void carbill() {
		
		//for every wheel, I will charge them £10 for  car
		//input for each car, amount of wheels 
		
		
		
		//filter, put in a list and check for specific item . have a formula for the bill - 
		
	}
	
}