package Methods;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side");
		double n1 = sc.nextDouble();
		System.out.println("Enter second side");
		double n2 = sc.nextDouble();
		System.out.println("Enter third side");
		double n3 = sc.nextDouble();
		
		System.out.println( is_Valid(n1, n2,n3) ?
                "The area of the triangle is " + area_triangle(n1, n2, n3) : "Invalid triangle" );
	}
	
	public static boolean is_Valid(double s1, double s2, double s3) {
		if(s1+s2 >s3 && s1+s3>s2 && s2+s3>s1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static double area_triangle(double s1, double s2, double s3) {
		double area = 0;
        double s = (s1 + s2 + s3)/2;
        area = Math.sqrt(s*(s - s1)*(s - s2)*(s - s3));
        return area;
	}

}
