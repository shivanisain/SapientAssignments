package com.sapient.Num_Process;

public class Num_Processrunner {

	public static void main(String[] args) {
		Num_Process[] Processes = { new add(), new subtract(), new multiply(), new divide() };
		for (Num_Process object : Processes) {
			int result = object.cal(3, 4);
			System.out.println(result);
		}
	}
}