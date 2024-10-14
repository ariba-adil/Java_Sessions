package ConditionalStatement;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a letter");
		String s = sc.next();
		
		if(s.length()>1) {
			System.out.println("Error: Entered value is not a character");
		}
		
		else {
			if((s.charAt(0)=='a') || (s.charAt(0)=='e') || (s.charAt(0)=='i') || (s.charAt(0)=='o') || (s.charAt(0)=='u') || (s.charAt(0)=='A') || (s.charAt(0)=='E') || (s.charAt(0)=='I') || (s.charAt(0)=='O') || (s.charAt(0)=='U')) {
				System.out.println("Input letter is a vowel");
			}
			
			else {
				System.out.println("Input letter is a consonant");
			}
		}

	}

}
