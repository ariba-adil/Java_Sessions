package ConditionalStatement;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		System.out.println("Enter third number");
		int c = s.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is greatest");
		}
		else if(b>a && b>c) {
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
		
	}

}
