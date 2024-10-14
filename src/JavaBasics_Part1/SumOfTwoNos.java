package JavaBasics_Part1;

import java.util.Scanner;

public class SumOfTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calculate the sum of 24 and 26
//        int sum = 24 + 26;
//        System.out.println(sum);
//        
        
        //Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer
       Scanner s = new Scanner(System.in);
       System.out.println("Enter first no");
       int n1 = s.nextInt();
       System.out.println("Enter second no");
       int n2 = s.nextInt();
       System.out.println("Enter third no");
       int n3 = s.nextInt();
       
       if((n1+n2) == n3 || (n1+n3) == n2 || (n2+n3) == n1) {
    	   System.out.println("true");
       }
       else {
    	   System.out.println("false");
       }
       
        

	}

}
