package java07_inherit.practice.model;

public class Circle extends Point{
	private int radius;
	
	public Circle(){
		
	}
	public Circle(int x, int y, int radius){
		super(x,y);
		this.radius = radius;
	}
	public void draw() {
		System.out.print("중심점 : ");
		super.draw();
		System.out.printf("원면적 : %.1f", Math.PI*getRadius()*getRadius());
		System.out.println();
		System.out.printf("원둘레 : %.1f", 2*Math.PI*getRadius());
		System.out.println();
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
