package JavaBasicPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("enter the year to check");
		
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		// if the year is divided by 4
	    if (year % 4 == 0) {
	      if (year % 100 == 0) { // if the year is century

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	        	System.out.println("it is a leap year");
	        else
	        	System.out.println("it is not a leap year");
	      }
	      
	      // if the year is not century
	      else
	    	  System.out.println("it is a leap year");
	    }
	    
	    else
	    	System.out.println("it is not a leap year");

	}

}
