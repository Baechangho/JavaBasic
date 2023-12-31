package java06_class.uml;

public class Car{
	private String model;
	private String color;
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void display() {
		System.out.println(model + ", " + color);
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
}