package ConditionalStatement;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		if(n>0) {
			System.out.println(n + " is positive");
		}
		if(n<0) {
			System.out.println(n + " is negative");
			
		}

	}

}
