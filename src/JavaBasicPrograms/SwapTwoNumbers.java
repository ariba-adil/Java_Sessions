package JavaBasicPrograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		
       System.out.println("enter first number");
		
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		
		System.out.println("enter second number");
		int a2 = s.nextInt();
		
		swap(a1, a2);
		
	}
	
	public static void swap(int m, int n) {
		
		int temp = m;
		m = n;
		n = temp;
		
		System.out.println("After swapping, value of a1 is " + m  + "and value of a2 is " + n);		

	}
}


