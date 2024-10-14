package JavaBasics_Part1;

import java.util.Scanner;

public class AverageOfThreeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input first number");
		int a1 = s.nextInt();
		
		System.out.println("Input second number");
		int a2 = s.nextInt();

		System.out.println("Input third number");
		int a3 = s.nextInt();
		
		int avg = (a1+a2+a3)/3;
		System.out.println(avg);


	}

}
