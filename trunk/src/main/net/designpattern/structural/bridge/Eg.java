package net.designpattern.structural.bridge;

public class Eg {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle();
		shapes[1] = new Rectangle();
		
		for(Shape shape : shapes){
			shape.draw();
		}

	}

}
