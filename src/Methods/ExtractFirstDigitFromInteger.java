package Methods;

import java.util.Scanner;

public class ExtractFirstDigitFromInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integer can be positive or negative
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = s.nextInt();
		extractFirstDigit(n);
		}
	
	public static void extractFirstDigit(int a) {
		String z = Integer.toString(a);
		char c = z.charAt(0);
		int firstDigit = Character.getNumericValue(c);
		System.out.println(firstDigit);
		
	}

}
