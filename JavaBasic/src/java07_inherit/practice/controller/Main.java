package java07_inherit.practice.controller;
import java.util.Scanner;

import java07_inherit.practice.model.*;

public class Main {

	public static void main(String[] args) {
		
		final int NUM = 5;
		
		Scanner sc = new Scanner(System.in);
		Point[] c = new Circle[NUM];
		Point[] r = new Rectangle[NUM];
		for(int i = 0; i < NUM; i++) {
			c[i] = new Circle(sc.nextInt(),sc.nextInt(),sc.nextInt());
			r[i] = new Rectangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
//		c[0] = new Circle(1,2,3);
//		c[1] = new Circle(2,3,4);
//		c[2] = new Circle(3,4,5);
//		c[3] = new Circle(4,5,6);
//		c[4] = new Circle(5,6,7);
//		r[0] = new Rectangle(1,2,3,4);
//		r[1] = new Rectangle(2,3,4,5);
//		r[2] = new Rectangle(3,4,5,6);
//		r[3] = new Rectangle(4,5,6,7);
//		r[4] = new Rectangle(5,6,7,8);
		
		for(int i = 0; i < NUM; i++) {
			System.out.println("-----------------");
			c[i].draw();
			System.out.println("-----------------");
			r[i].draw();
		}
		
		
	}

}
