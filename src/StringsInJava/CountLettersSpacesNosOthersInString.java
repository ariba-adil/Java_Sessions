package StringsInJava;

import java.util.Scanner;

public class CountLettersSpacesNosOthersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		
		char[] charArr = s.toCharArray();
		for(int i = 0; i<charArr.length; i++) {
			if(Character.isLetter(charArr[i])) {
				letter = letter+1;
			}
			
			else if(Character.isSpaceChar(charArr[i])) {
				space = space+1;
			}
			
			else if(Character.isDigit(charArr[i])) {
				number = number+1;
			}
			
			else {
				other = other+1;
			}
		}
		
		System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);


	}

}
