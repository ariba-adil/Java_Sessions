package Methods;

import java.util.Scanner;

public class LeapYear {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year");
		int n = s.nextInt();
        LeapYear lp = new LeapYear();
        lp.leapYear(n);
	}
	
	public void leapYear(int year) {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("true");
				}
				else {
					System.out.println("false");
				}
			}
			else {
				System.out.println("false");
			}
		}
		else {
			System.out.println("false");
		}
	}

}
