package com.sapients.shapes;

public class Shape {

	void calculateShapeArea(int numberOfSides, int length) {

		switch (numberOfSides) {

		case 1:
			new Circle(length).calculateArea();
			break;
		case 3:
			new Triangle(length).calculateArea();
			break;
		case 4:
			new Square(length).calculateArea();
			break;
		default:
			System.out.println("No Shapes Present");
		}
	}

	public static void main(String[] args) {
		Shape object = new Shape();
		object.calculateShapeArea(3, 15);
	}

}
