package in.blogspot.randomcompiler.strategy.pattern.demo;

import in.blogspot.randomcompiler.strategy.pattern.api.Vehicle;
import in.blogspot.randomcompiler.strategy.pattern.impl.Bike;
import in.blogspot.randomcompiler.strategy.pattern.impl.Car;
import in.blogspot.randomcompiler.strategy.pattern.impl.LoudHorn;
import in.blogspot.randomcompiler.strategy.pattern.impl.LowHorn;
import in.blogspot.randomcompiler.strategy.pattern.impl.MildHorn;
import in.blogspot.randomcompiler.strategy.pattern.impl.Truck;

public class StrategyPatternDemo {

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