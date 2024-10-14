package ConditionalStatement;

import java.util.Scanner;

public class CubeUptoAnInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int n = sc.nextInt();
		int cube = 0;
		
//		for(int i =1 ;i<=n; i++) {
//			System.out.println(i);
//			cube = i*i*i;
//			System.out.println(cube);
//		}
		
		//or
		for(int i=1;i<=n;i++)
	     {
	     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
	    }


	}

}
