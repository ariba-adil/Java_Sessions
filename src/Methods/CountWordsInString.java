package Methods;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		countWords(s);

	}
	
	public static void countWords(String str) {
		String arr[] = str.split(" ");
		int l = arr.length;
		System.out.println(l);
		
	}

}
