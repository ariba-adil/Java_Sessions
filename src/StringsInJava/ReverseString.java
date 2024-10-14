package StringsInJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		
		System.out.println("Approach 1");
	    System.out.println(s.length());
	
		//Approach 1 - using charAt(int index) method
		for(int i = s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		
		//Approach 2 - using toCharArray() method 
		System.out.println("Approach 2");
		char[] charArr = s.toCharArray();
		System.out.println(charArr.length);
		for(int i = charArr.length-1; i>=0; i--) {
			System.out.println(charArr[i]);
		}
		
		//Approach 3 - using reverse() method of StringBuffer class
		System.out.println("Approach 3");
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
		
		//Approach 4 - using reverse() method of StringBuilder class
		System.out.println("Approach 4");
		StringBuilder sbuilder = new StringBuilder(s);
		System.out.println(sbuilder.reverse());
		
	}

}
