package com.sapients.IpMethod;

import java.io.IOException;

public class IPRunner {

	public static void main(String[] args) throws IOException {

		Command_Line object = new Command_Line();
		object.setData(5, args);
		object.calData();
		object.displayData();

		Keyboard_Line object1 = new Keyboard_Line();
		object1.Read(5);
		object1.display();
		object1.sort();
		object1.display();
		object1.find(4);

	}
}