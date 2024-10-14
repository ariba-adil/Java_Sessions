package StringsInJava;

import java.util.Scanner;

public class CapitalizeFirstLetterOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//word = ariba
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string number");
		String s = sc.nextLine();
		
//		String arr[] = s.split("");
//		String a = arr[0].toUpperCase();
//		System.out.println(a+s.substring(1));
//		System.out.println(a.concat(s.substring(1)));
		
		
//		OR
		
		String firstLetter = s.substring(0, 1);
		String restOfWord = s.substring(1);
		firstLetter = firstLetter.toUpperCase();
		
		String capitalizedWord = firstLetter + restOfWord;
        System.out.println("Capitalized word: " + capitalizedWord);

			
		

	}

}
