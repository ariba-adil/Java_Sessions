package Methods;

import java.util.Scanner;

public class DisplayMiddleCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		displayMiddleCharacterOfString(s);

	}
	
	public static void displayMiddleCharacterOfString(String s1) {
		int length = s1.length();
		if(length%2!=0) {
			System.out.println(s1.substring(s1.length()/2 -1));
		}
		else {
			
		}
	}
 
}
