package JavaBasics_Part1;

public class PrintNosDivisibleBy3By5ByBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print nos between 1 and 100
		System.out.println("Divided by 3: ");
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Divided by 5: ");
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Divided by 3 and 5: ");
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
		
		
	}
}

