package java13_io.filterStream;

import java.io.Serializable;

public class Point implements Serializable{
	private int x;
	private int y;
	
	public Point() {}
	
	//alt shift s o
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//alt shift s r
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//alt shift s s
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
