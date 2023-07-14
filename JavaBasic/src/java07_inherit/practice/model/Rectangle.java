package java07_inherit.practice.model;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		System.out.print("기준점 : ");
		super.draw();
		System.out.printf("면적 : %.1f", (double)getWidth()*getHeight());
		System.out.println();
		System.out.printf("둘레 : %.1f", (double)2*(getWidth()+getHeight()));
		System.out.println();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
