package Methods;

import java.util.Scanner;

public class SumOfDigitsInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = s.nextInt();
		sum(n);
		

	}
	
	public static void sum(int a) {
		int sum = 0;
		while(a!=0) {
			sum = sum + a%10;
			a = a/10;
			
		}
		System.out.println(sum);
	}

}
