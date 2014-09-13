package in.blogspot.randomcompiler.strategy.pattern.api;


public abstract class Vehicle {
	private Horn horn;
	
	public void turnLeft() {
		System.out.println("Taking a left turn");
	}
	
	public void turnRight() {
		System.out.println("Taking a right turn");
	}
	
	public abstract void display();
	
	public void setHorn(Horn horn) {
		this.horn = horn;
	}
	
	public void honk() {
		horn.honk();
	}
}