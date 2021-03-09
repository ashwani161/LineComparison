package com.line;
import java.util.Scanner;
import java.util.Arrays;
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
		length = Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2)));
		System.out.println("The Length of line is" + (length));
		
		double r1 = 0;
		double s1 = 0;
		double r2 = 0;
		double s2 = 0;
		System.out.println("Please enter R1 coordinate: ");
		x1 = scan.nextInt();
		System.out.println("Please enter S1 coordinate: ");
		y1 = scan.nextInt();
		System.out.println("Please enter R2 coordinate: ");
		x2 = scan.nextInt();
		System.out.println("Please enter S2 coordinate: ");
		y2 = scan.nextInt();
		scan.close();
		double a1[]= {x1,y1,x2,y2};
		double a2[]= {r1,s1,r2,s2};
		boolean status=true;
		if(a1.length == a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i] !=a2[i])
				{
					status=false;
				}
			}
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("lengths are Equal");
		}
		else
		{
			System.out.println("lengths are NOT equal");
		}
	}
}
