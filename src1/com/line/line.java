package com.line;
import java.util.Scanner;
public class line {
	public static void main(String args[]) {
		System.out.println("Welcome to Line");
		System.out.println("Comparison Computation");
		System.out.println("Program on Master Branch");
		Scanner scan = new Scanner(System.in);
		double x1 = 0;
		double y1 = 0;
		double x2 = 0;
		double y2 = 0;
		double length = 0;
		System.out.println("Please enter X1 coordinate: ");
		x1 = scan.nextInt();
		System.out.println("Please enter Y1 coordinate: ");
		y1 = scan.nextInt();
		System.out.println("Please enter X2 coordinate: ");
		x2 = scan.nextInt();
		System.out.println("Please enter Y2 coordinate: ");
		y2 = scan.nextInt();
		scan.close();
		length = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2)));
		System.out.println("The Length of line is" + (length));
	}
}
