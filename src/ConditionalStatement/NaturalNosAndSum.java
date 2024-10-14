package ConditionalStatement;

import java.util.Scanner;

public class NaturalNosAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i);
			sum = sum+i;
			}
		System.out.println("The Sum of Natural Number upto "+n+ " terms : " +sum);
		
		

	}

}
