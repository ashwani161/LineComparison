package com.line;

import java.util.Scanner;

public class line {
	public double x1, x2, y1, y2, r1, r2, s1, s2, Length1, Length2;

	public void Length1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values for Line 1");
		System.out.println("Enter the value of x1");
		// taking input from user for x1,x2,y1,y2 of Line1
		System.out.println("Please enter X1 coordinate: ");
		x1 = scan.nextInt();
		System.out.println("Please enter Y1 coordinate: ");
		y1 = scan.nextInt();
		System.out.println("Please enter X2 coordinate: ");
		x2 = scan.nextInt();
		System.out.println("Please enter Y2 coordinate: ");
		y2 = scan.nextInt();
		Length1 = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));
		System.out.println("The Length of line1 is " + (Length1));

		System.out.println("Enter the values for Line 2");
		// taking input from user for r1,r2,s1,s2 of Line2
		System.out.println("Enter the value of R1 coordinate");
		r1 = scan.nextInt();
		System.out.println("Enter the value of R2 coordinate");
		r2 = scan.nextInt();
		System.out.println("Enter the value of S1 coordinate");
		s1 = scan.nextInt();
		System.out.println("Enter the value of S2 coordinate");
		s2 = scan.nextInt();

		Length2 = Math.sqrt((Math.pow((r2 - r1), 2)) + (Math.pow((s2 - s1), 2)));
		System.out.println("Length of Line 2: " + Length2);

		String s1 = Double.toString(Length1);
		String s2 = Double.toString(Length2);
		System.out.println("equality of two lines using Equal method " + s1.equals(s2));
		System.out.println("equality of two lines using CompareTo method " + s1.compareTo(s2));
	}

	public static void main(String args[]) {
		line lineobj1 = new line();
		lineobj1.Length1();

	}
}