package StringsInJava;

public class RemoveWhitespacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " j  a  va s     ta  r  ";
		//System.out.println(str.replace(" ", ""));
		//System.out.println(str.replaceAll(" ",""));
		
		// \\s - represents single space
		System.out.println(str.replaceAll("\\s",""));
		
		//trim() cannot be used as it only removes before and after spaces - not in between spaces
		//System.out.println(str.trim());
		

	}

}
