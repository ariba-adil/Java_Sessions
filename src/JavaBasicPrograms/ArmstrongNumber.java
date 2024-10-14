package JavaBasicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cube = 0;
		
       System.out.println("enter a number to check if its armstrong or not");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		String s1 = String.valueOf(n);
		
		//System.out.println(s1.length());
		
		for(int i = 0; i<s1.length(); i++) {
			char c1 = s1.charAt(i);
			int a1 = c1 - '0';
			//System.out.println(a1);
			cube = a1*a1*a1;
			System.out.println(cube);
			
		}
		
		//if(cube == )
		
	}

}
