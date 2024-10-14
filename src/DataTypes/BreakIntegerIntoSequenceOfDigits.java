package DataTypes;

import java.util.Scanner;

public class BreakIntegerIntoSequenceOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		int a = sc.nextInt();
		
		String s = Integer.toString(a);
			for(int i=0; i<s.length(); i++) {
			  System.out.println(s.charAt(i));
		}

	}

}
