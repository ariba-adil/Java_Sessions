package ConditionalStatement;

import java.util.Scanner;

public class NoOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//February 2016 has 29 days
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a month number");
		int month = s.nextInt();
		
		System.out.println("Enter a year");
		int year = s.nextInt();
		
		String monthName = "";
		int no_of_days = 0;
		
		switch(month) {
			case 1:
				monthName = "January";
			    no_of_days = 31;
			    break;
			case 2 :
				monthName = "February";
				if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    no_of_days = 29;
                } else {
                    no_of_days = 28;
                }
				break;
			case 3:
                monthName = "March";
                no_of_days = 31;
                break;
            case 4:
                monthName = "April";
                no_of_days = 30;
                break;
            case 5:
                monthName = "May";
                no_of_days = 31;
                break;
            case 6:
                monthName = "June";
                no_of_days = 30;
                break;
            case 7:
                monthName = "July";
                no_of_days = 31;
                break;
            case 8:
                monthName = "August";
                no_of_days = 31;
                break;
            case 9:
                monthName = "September";
                no_of_days = 30;
                break;
            case 10:
                monthName = "October";
                no_of_days = 31;
                break;
            case 11:
                monthName = "November";
                no_of_days = 30;
                break;
            case 12:
                monthName = "December";
                no_of_days = 31;
		}
		System.out.println(monthName +  year + " has " + no_of_days + " days ");

	}

}
