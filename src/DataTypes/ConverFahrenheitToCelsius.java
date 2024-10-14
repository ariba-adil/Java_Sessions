package DataTypes;

import java.util.Scanner;

public class ConverFahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(5*(f-32)) /9
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temp in farenheit");
		double farenheit = s.nextDouble();
		
		double celsius = (5*(farenheit-32))/9;
		System.out.println("Temperature in celsius is " + celsius +"C");

	}

}
