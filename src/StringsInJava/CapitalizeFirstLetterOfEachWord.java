package StringsInJava;

import java.util.Scanner;

public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string - the quick brown fox jumps over the lazy dog
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string number");
		String s = sc.nextLine();
		
		String arr[] = s.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			// taking letter individually from sentences
            String firstLetter = arr[i].substring(0, 1); //t
            String restOfWord = arr[i].substring(1); // he
            
            //making first letter uppercase using toUpperCase function
            firstLetter = firstLetter.toUpperCase(); // T
            arr[i] = firstLetter + restOfWord; //The
            System.out.println(arr[i]);
		}
		
		// joining the words together to make a sentence
        String capitalizedSentence = String.join(" ", arr);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
		

	}

}
