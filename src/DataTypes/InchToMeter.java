package DataTypes;

import java.util.Scanner;

public class InchToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner s = new Scanner(System.in);
		//1 inch = 0.0254 m
		Scanner s = new Scanner(System.in);
		System.out.println("Enter inch");
		double inch = s.nextDouble();
		double meter = inch*0.0254;
		System.out.println(inch + "inch will be " + meter + " metrers");


	}

}
