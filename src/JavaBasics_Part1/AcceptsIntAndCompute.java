package JavaBasics_Part1;

import java.util.Scanner;

public class AcceptsIntAndCompute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compute n+nn+nnn
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		System.out.println(System.currentTimeMillis());

	}

}
