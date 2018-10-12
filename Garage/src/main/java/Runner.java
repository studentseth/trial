import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		Car car = new Car("Ford", 4, "blue", 4, 1); // constructor
		/*car.type = "car";
		car.wheels = 4;
		car.colour = "blue";
*/
	/*	System.out.println(car.toString());*/

		Motorcycle mc = new Motorcycle("motorcycle", 2, "red", 1,2);
		/*mc.type = "motorcycle";
		mc.wheels = 2;
		mc.colour = "red";*/
	/*	System.out.println(mc.toString());
*/
		Bicycle bike = new Bicycle("bike", 2, "black", "leather");
	/*	bike.type = "bicycle";
		bike.wheels = 2;
		bike.colour = "black";*/
		/*System.out.println(bike.toString());
*/
		/*ArrayList<Vehicle> VehicleList = new ArrayList<Vehicle>();
		VehicleList.add(car);
		VehicleList.add(mc);
		VehicleList.add(bike);*/
		// System.out.println(VehicleList);

		Garage g1 = new Garage(); //create garage constructor call it g1
		g1.addToGarage(car); //add objects produced by constructors to garage
		g1.addToGarage(bike);
		g1.addToGarage(mc);
		System.out.println(g1.getGarageList()); //print garage list 
	}

}
