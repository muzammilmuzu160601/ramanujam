package areaofcircle;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("Enter the radius:");
	      
	      double radius = scanner.nextDouble();
	      double area = Math.PI * (radius * radius);
	      double circumference= Math.PI * 2*radius;
	      
	      System.out.println("the circumference of the circle is:" +circumference);
	}

}
