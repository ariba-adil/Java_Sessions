package StringsInJava;

import java.util.Scanner;

public class ConvertStringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		
		int i = Integer.parseInt(s);
		System.out.println(i);

	}

}
