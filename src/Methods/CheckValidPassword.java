package Methods;

import java.util.Scanner;

public class CheckValidPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A password must have at least eight characters.
//		A password consists of only letters and digits.
//		A password must contain at least two digits
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");
		String str = sc.nextLine();
        checkPassword(str);
	}
	
	public static void checkPassword(String pass) {
		int pass_length = 8;
		int digitCount = 0 ;
		int letterCount = 0;
		
		if(pass.length()>=pass_length) {
			for(int i=0; i<pass.length(); i++) {
				char c = pass.charAt(i);
				if(Character.isLetter(c)) {
					letterCount = letterCount+1;
					
					if(Character.isDigit(c)) {
						digitCount = digitCount+1;
					}
					
				}}}
		else {
			System.out.println("invalid password");
		}
		
		if(digitCount>1) {
			System.out.println("valid password");
		}
		else {
			System.out.println("invalid password");
		}
		
		}}


