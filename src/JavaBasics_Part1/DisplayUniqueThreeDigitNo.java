package JavaBasics_Part1;

import java.util.Scanner;

public class DisplayUniqueThreeDigitNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using 1,2,3,4
		
		int count = 0;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				for(int k =1; k<=4; k++) {
					if(k!=i && k!=j && i!=j) {
						count = count+1;
						System.out.println(i + "" + j + "" + k);
					}
				}
			}
		}
		
        System.out.println("Total number of the three-digit-number is " + count);
	}

}
