package in.blogspot.randomcompiler.tests;

import in.blogspot.randomcompiler.horn.impl.LoudHorn;
import in.blogspot.randomcompiler.horn.impl.LowHorn;
import in.blogspot.randomcompiler.horn.impl.MildHorn;
import in.blogspot.randomcompiler.vehicle.api.Vehicle;
import in.blogspot.randomcompiler.vehicle.impl.Bike;
import in.blogspot.randomcompiler.vehicle.impl.Car;
import in.blogspot.randomcompiler.vehicle.impl.Truck;

public class VehiclesHonkingTest1 {

	public static void main(String[] args) {
		Vehicle v1 = new Bike();
		v1.setHorn(new LowHorn());
		
		Vehicle v2 = new Car();
		v2.setHorn(new MildHorn());
		
		Vehicle v3 = new Truck();
		v3.setHorn(new LoudHorn());
		
		v1.display();
		v1.honk();
		
		v2.display();
		v2.honk();
		
		v3.display();
		v3.honk();
	}
}