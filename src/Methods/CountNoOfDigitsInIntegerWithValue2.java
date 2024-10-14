package Methods;

import java.util.Scanner;

public class CountNoOfDigitsInIntegerWithValue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		//long n = s.nextLong();
		int n = s.nextInt();
		System.out.println("No of digits with value 2: " + countTwo(n));

	}
	
	public static int countTwo(int a) {
		int count = 0;
		String str = Integer.toString(a);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='2') {
				count = count+1;
			}
			else {
				count = count;
			}
			
		}
		return count;
	}
	
		
	

}
