package DataTypes;

import java.util.Scanner;

public class ConvertMinutesIntoDaysAndYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter minutes");
		double min = s.nextDouble();
		double minutesInYear = 60*24*365;
		
		long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
//(int)
	}

}
