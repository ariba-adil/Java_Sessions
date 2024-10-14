package DataTypes;

import java.util.Scanner;

public class SumOfDigitsOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = s.nextInt();
		int sum = 0;
		if(n>=0 && n<=1000) {
			while(n!=0) {
				sum = sum + n%10;
				n = n/10;
			}
		}
		else {
			System.out.println("invalid input - input must be in the range 0 to 1000");
		}
		System.out.println(sum);
	}

}
