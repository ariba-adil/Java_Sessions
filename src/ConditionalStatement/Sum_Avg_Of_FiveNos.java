package ConditionalStatement;

import java.util.Scanner;

public class Sum_Avg_Of_FiveNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input five numbers");
		
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sum = sum+i;
			}
		System.out.println("The Sum of five numbers is : " +sum);
		
		int avg = sum / 5;
		System.out.println("The Average of five numbers is : " +avg);


	}

}
