package StringsInJava;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "$ja!va$st%ar";
		System.out.println(s.replaceAll("[$!%]", ""));

	}

}
