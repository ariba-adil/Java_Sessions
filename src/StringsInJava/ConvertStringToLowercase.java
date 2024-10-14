package StringsInJava;

import java.util.Scanner;

public class ConvertStringToLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG           
		//Output String: the quick brown fox jumps over the lazy dog
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a string");
				String s = sc.nextLine();
								
				String arr[] = s.split(" ");
				for(int i=0; i<arr.length; i++) {
					arr[i] = arr[i].toLowerCase();
					
				}
				
				String lowerCase = String.join(" ", arr);
		        System.out.println("Lowercase sentence: " + lowerCase);
				
				
				
				

	}

}
