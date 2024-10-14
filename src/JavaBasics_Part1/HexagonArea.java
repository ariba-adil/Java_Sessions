package JavaBasics_Part1;

import java.util.Scanner;

public class HexagonArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//		where s is the length of a side
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of hexagon");
		double s = sc.nextDouble();
		
		double area = (6*s*s)/(4*Math.tan(Math.PI/6));
		System.out.println("Area of hexagon is " + area);
		

	}

}
