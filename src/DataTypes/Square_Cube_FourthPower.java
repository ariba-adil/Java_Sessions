package DataTypes;

import java.util.Scanner;

public class Square_Cube_FourthPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		double a = sc.nextDouble();
		
		double square = a*a;
		double cube = a*a*a;
		double fourthPower = Math.pow(a, 4);
		System.out.println("Square of " + a + "is " + square);
		System.out.println("Cube of " + a + "is " + cube);
		System.out.println("FourthPower of " + a + "is " + fourthPower);

	}

}
