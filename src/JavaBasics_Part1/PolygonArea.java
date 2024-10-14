package JavaBasics_Part1;

import java.util.Scanner;

public class PolygonArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Area of a polygon = (n*s^2)/(4*tan(π/n))
		//where n is n-sided polygon and s is the length of a side
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of side of polygon");
		double s = sc.nextDouble();
		System.out.println("Enter no of sides of polygon");
		int n = sc.nextInt();
		
				
		double area = (n*s*s)/(4*Math.tan(Math.PI/n));
		System.out.println("Area of polygon is " + area);

	}

}
