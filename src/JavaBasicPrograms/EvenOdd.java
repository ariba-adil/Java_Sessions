package JavaBasicPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("enter number to check if its even or odd");
		
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		
		if(a1 % 2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}
