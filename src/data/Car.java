package data;

public class Car {
	
	private String name;
	private double value;
	public Car(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", value=" + value + "]";
	}

	
	
}
