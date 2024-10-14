package JavaBasics_Part1;

import java.util.Scanner;

public class ComputeSumOfIntegerDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a integer");
		int n = s.nextInt();
		
		int sum = 0;
		// % -- gives remainder
		//n=25
		while (n != 0) {
            sum = sum + (n % 10); //5, 5+2=7
            n = n / 10; //2, 0
        }
		System.out.println(sum);
		
		
		

	}

}
