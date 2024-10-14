package Methods;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		double n1 = s.nextDouble();
		System.out.println("Enter second number");
		double n2 = s.nextDouble();
		System.out.println("Enter third number");
		double n3 = s.nextDouble();
		
		average(n1, n2, n3);

	}
	
	public static void average(double x, double y, double z) {
		double avg = (x+y+z) / 3;
		System.out.println("Average of three numbers is " + avg);
	}

}
