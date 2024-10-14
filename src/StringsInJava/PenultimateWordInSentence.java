package StringsInJava;

import java.util.Scanner;

public class PenultimateWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//penultimate (next to the last)
//		Input a String: The quick brown fox jumps over the lazy dog
//		Penultimate word: lazy
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		
		String arr[] = s.split(" ");
			System.out.println(arr[arr.length-2]);
			
		

	}

}
