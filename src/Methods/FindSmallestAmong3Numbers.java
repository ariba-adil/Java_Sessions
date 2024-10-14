package Methods;

import java.util.Scanner;

public class FindSmallestAmong3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		double n1 = s.nextDouble();
		System.out.println("Enter second number");
		double n2 = s.nextDouble();
		System.out.println("Enter third number");
		double n3 = s.nextDouble();
		
		System.out.println(smallestNumber(n1, n2, n3));
		
	}
	
//	public static double smallestNumber(double x, double y, double z) {
//		if(x<y && x<z) {
//			return x;
//		}
//		else if(y<x && y<z) {
//			return y;
//		}
//		else {
//			return z;
//		}
//	}
	
	public static double smallestNumber(double x, double y, double z) {
		return Math.min(Math.min(x, y), z);
	}
	

}
