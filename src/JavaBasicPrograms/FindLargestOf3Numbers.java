package JavaBasicPrograms;

import java.util.Scanner;

public class FindLargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("enter first number");
		
		Scanner s = new Scanner(System.in);
		int a1 = s.nextInt();
		
		System.out.println("enter second number");
		int a2 = s.nextInt();
		
		System.out.println("enter third number");
		int a3 = s.nextInt();
		
		if(a1>a2) {
			if(a1>a3) {
				System.out.println("a1 is greatest");
			}
			else {
				System.out.println("a3 is greatest");
			}
		}
		if (a2>a1) {
			if(a2>a3) {
				System.out.println("a2 is greatest");
			}
			else {
				System.out.println("a3 is greatest");
			}
		}
		
	}

}
