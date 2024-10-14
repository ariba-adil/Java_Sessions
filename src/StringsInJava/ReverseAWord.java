package StringsInJava;

import java.util.Scanner;

public class ReverseAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//word - dsaf
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String s = sc.nextLine();
		String res = "";
		
//		char arr[] = s.toCharArray();
//		for(int i=arr.length-1; i>=0; i--) {
//			res = res + arr[i];
//		}
		
		for(int i = s.length()-1; i>=0; i--) {
		    res = res+s.charAt(i);
		}
		
		System.out.println(res);
		
		

	}

}
