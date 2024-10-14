package Methods;

import java.util.Scanner;

public class ConsecutiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");
		int a1 = sc.nextInt();
		System.out.println("Enter second integer");
		int a2 = sc.nextInt();
		System.out.println("Enter third integer");
		int a3 = sc.nextInt();
		System.out.println(checkConsecutive(a1,a2,a3));
		//15, 16, 17
		//17, 16, 15
	}
	
	public static boolean checkConsecutive(int n1, int n2, int n3) {
		if(n2-n1==1 && n3-n2==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
