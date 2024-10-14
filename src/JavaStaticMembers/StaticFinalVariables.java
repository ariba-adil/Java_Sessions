package JavaStaticMembers;

public class StaticFinalVariables {
	public static final double pi = 3.14159;
	
	public static double calculateArea(double radius) {
        return pi * radius * radius;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("area of circle is: "+ StaticFinalVariables.calculateArea(5.0));

	}

}
