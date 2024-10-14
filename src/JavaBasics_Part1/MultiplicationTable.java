package JavaBasics_Part1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number");
		int n = s.nextInt();
		for(int i = 0; i<=10; i++) {
			int result = n*i;
			System.out.println(n + "x" + i + "=" + result);
			}
		
	}

}
