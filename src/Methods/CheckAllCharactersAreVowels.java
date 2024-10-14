package Methods;

import java.util.Scanner;

public class CheckAllCharactersAreVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("Input a string: ");
	    String str = sc.nextLine();
	    System.out.println(check(str));


	}
	
	public static boolean check(String s) {
		int count = 0;
		String s1 = s.toLowerCase();
		char arr[] = s1.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') {
				count = count+1;
			}
		}
		if(count==arr.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
