package Methods;

import java.util.Scanner;

public class MiddleCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		checkMiddleCharacter(str);
		//1234

	}
	
	public static void checkMiddleCharacter(String s) {
		if(s.length()%2!=0) {
			
			int mid = s.length()/2;
			System.out.println(s.charAt(mid));
		}
		
		if(s.length()%2==0) {
			int mid = s.length()/2-1;
			System.out.println(s.substring(mid, mid+2));
		}
	}

}
