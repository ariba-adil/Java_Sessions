package JavaBasics_Part1;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = s.nextInt();
		System.out.println("Enter second number");
		int n2 = s.nextInt();
		System.out.println("Enter third number");
		int n3 = s.nextInt();
		
		if(n2>n1 && n3>n2) {
			System.out.println("true");
		}
		
		

	}

}
