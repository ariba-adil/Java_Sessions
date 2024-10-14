package Methods;

import java.util.Scanner;

public class CheckEveryDigitIsEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = s.nextInt();
		checkEveryDigit(n);
		}


    public static void checkEveryDigit(int a) {
    	int count = 0;
    	String str = Integer.toString(a);
    	for(int i =0; i<str.length(); i++) {
    		if(str.charAt(i)%2==0) {
    			count = count+1;
    		}
    		
    	}
    	if(count==str.length()) {
    		System.out.println("true");
    		int z = Integer.parseInt(str);
    	}
    	else {
    		System.out.println("false");
    	}

    	
    	
    	

}
}
