package JavaBasics_Part1;

import java.util.Scanner;

public class DistanceBetweenTwoPointsOnEarth {
	static final double radius = 6371.01;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Distance between the two points [ (x1,y1) & (x2,y2)]
//		d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//		Radius of the earth r = 6371.01 Kilometers
//		Input Data:
//		Input the latitude of coordinate 1: 25
//		put the longitude of coordinate 1: 35
//		Input the latitude of coordinate 2: 35.5
//		Input the longitude of coordinate 2: 25.5
//		Expected Output
//  	The distance between those points is: 1480.0848451069087 km
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter latitude 1");
		double lat1 = sc.nextDouble();
		System.out.println("Enter longitude 1");
		double long1 = sc.nextDouble();
		System.out.println("Enter latitude 2");
		double lat2 = sc.nextDouble();
		System.out.println("Enter longitude 2");
		double long2 = sc.nextDouble();
		
		// Convert latitude and longitude to radians
		//It converts latitude and longitude values from degrees to radians using the " Math.toRadians()" method to perform trigonometric calculations
		lat1 = Math.toRadians(lat1);
		long1 = Math.toRadians(long1);
		lat2 = Math.toRadians(lat2);
		long2 = Math.toRadians(long2);
		
		double distance = radius*Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2));
		System.out.println("Distance between two points on earth is " + distance);

	}

}
