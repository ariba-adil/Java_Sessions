package JavaBasics_Part1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Number is even");
			System.out.println(1);
		}
		else {
			System.out.println("Number is odd");
			System.out.println(0);
		}

	}

}
