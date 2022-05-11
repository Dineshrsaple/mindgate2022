package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.ShapesFactory;
import com.mindgate.pojo.Shapes;

public class ShapesMain {
	public static void main(String[] args) {
		int choice;

		Scanner scanner = new Scanner(System.in);
		System.out.println("To Draw Circle  press 1");
		System.out.println("To Draw Triangle press 2");
		System.out.println("To Draw Square press 3");
		System.out.println("Enter Your Choice");
		choice = scanner.nextInt();

		Shapes shapes = ShapesFactory.getShapes(choice);
		if (shapes != null)
			shapes.draw();
		else
			System.out.println("Invalid Shape Choice");
	}

}
