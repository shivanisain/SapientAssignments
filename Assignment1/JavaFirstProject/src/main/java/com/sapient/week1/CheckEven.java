package com.sapient.week1;
import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if(check(num))
        	System.out.print("Even Number");
        else
        	System.out.print("Odd Number");
	}
    
	public static Boolean check(int n)
	{
		if(n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
	    }
	}
}
