package StringsInJava;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string - the quick brown fox jumps over the lazy dog
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a string");
				String s = sc.nextLine();
				
				String arr[] = s.split(" ");
				for(int i=0; i<arr.length; i++) {
					String firstLetter = arr[i].substring(0, 1);
					String restOfWord = arr[i].substring(1);
					
					firstLetter = firstLetter.toUpperCase();
					arr[i] = firstLetter+restOfWord;
					
				}
				
				String capitalizedSentence = String.join(" ", arr);
		        System.out.println("Capitalized sentence: " + capitalizedSentence);
	}

}
