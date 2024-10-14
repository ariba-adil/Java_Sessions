package DataTypes;

import java.util.Scanner;

public class CalculateSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in meter");
		float dis = sc.nextFloat();
		
		System.out.println("Enter hour");
		float hr = sc.nextFloat();
		System.out.println("Enter minutes");
		float min = sc.nextFloat();
		System.out.println("Enter seconds");
		float sec = sc.nextFloat();
		
		float timeInSec = (hr*3600) + (min*60) + sec;
		
		float speed_mps = dis/timeInSec;
		
		float speed_kmph = (speed_mps*5)/18;
		

	}

}
