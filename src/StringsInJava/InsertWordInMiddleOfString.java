package StringsInJava;

import java.util.Scanner;

public class InsertWordInMiddleOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Insert "Tutorial" in the middle of " Python 3.0", so the result will be Python Tutorial 3.0.
//		Sample Output: Python Tutorial 3.0
		
		String mainString = "Python 3.0";
		String word = "Tutorial";
		
		String result = mainString.substring(0, 7) + word + mainString.substring(6);
		System.out.println(result);


	}

}
