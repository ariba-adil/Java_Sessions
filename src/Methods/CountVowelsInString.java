package Methods;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input the string: w3resource
//		Expected Output:
//      Number of  Vowels in the string: 4
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		countVowels(s);

	}
	
	public static void countVowels(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count = count +1;
			}
		}
		System.out.println(count);
		
	}

}
