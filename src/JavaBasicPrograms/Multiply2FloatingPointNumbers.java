package JavaBasicPrograms;

import java.util.Scanner;

public class Multiply2FloatingPointNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter first float number");
		
		Scanner s = new Scanner(System.in);
		float f1 = s.nextFloat();
		
		System.out.println("enter second float number");
		float f2 = s.nextFloat();
		
		float result = f1*f2;
		System.out.println("Result of multiplying two mentioned floating numbers is " + result);

	}

}
