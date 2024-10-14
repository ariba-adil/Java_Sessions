package JavaStaticMembers;

public class StaticBlockForComplexInitialization {
	private static int x;
    private static int y;
    private static int z;
    
    static {
    	x = 10;
    	y = 20;
    	z = calculateZ(x, y);
    }
    
 // Static method to calculate the value of z
    private static int calculateZ(int a, int b) {
        return a * b + (a - b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
        System.out.println("Value of z: " + z);

	}

}
