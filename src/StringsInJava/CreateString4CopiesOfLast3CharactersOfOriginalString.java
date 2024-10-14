package StringsInJava;

public class CreateString4CopiesOfLast3CharactersOfOriginalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to create another string of 4 copies of the last 3 characters of the original string. The original string length must be 3 and above.
//		Input: Python Tutorial 3.0
//		Sample Output: 3.03.03.03.0
		
		String mainString = "Python Tutorial 3.0";
		
		String result = mainString.substring(mainString.length()-3);
		System.out.println(result+result+result+result);


		 

	}

}
