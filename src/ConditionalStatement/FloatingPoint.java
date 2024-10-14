package ConditionalStatement;

import java.util.Scanner;

public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		float f = s.nextFloat();
		 if(f>0) {
			 System.out.println("Positive Number");
		 }
		 if(f<0) {
			 System.out.println("Negative Number");
		 }
		 if(f==0) {
			 System.out.println("Zero");
		 }
	}

}
