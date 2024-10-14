package ConditionalStatement;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int n = sc.nextInt();
		
		for(int i =0; i<=10; i++) {
			int result = n*i;
			System.out.println(n + "X" + i + "=" + result);
		}
        
		
	}

}
