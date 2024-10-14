package Methods;

import java.util.Scanner;

public class FactorOf3InGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		int a = sc.nextInt();
		factor(a);

	}
	
	public static void factor(int n) {
		while (n%3==0) { //45
			System.out.println("3");
			n= n/3;
			
		}
		System.out.println(n);
		
	}

}
