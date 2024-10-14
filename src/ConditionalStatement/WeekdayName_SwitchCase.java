package ConditionalStatement;

import java.util.Scanner;

public class WeekdayName_SwitchCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int day = s.nextInt();
		
		String dayName = "";
		switch(day) {
			case 1: dayName = "Monday"; break;
			case 2: dayName = "Tuesday"; break;
			case 3: dayName = "Wednesday"; break;
			case 4: dayName = "Thursday"; break;
			case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
		}
 		System.out.println(dayName);
		
		
    }
	
}
