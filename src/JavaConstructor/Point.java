package JavaConstructor;
//Overloading Constructors with Different Data Types

public class Point {
	private int x;
	private int y;

	// Constructor that takes int parameters	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Constructor that takes double parameters
	public Point(double x, double y) {
		// Initialize instance variables by casting double to int
		this.x = (int) x;
		this.y = (int) y;
	}
	
	// Method to print the values of x and y
    public void printPoint() {
        System.out.println("Point (x, y): (" + x + ", " + y + ")");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(4,5);
		p1.printPoint();
		
		Point p2 = new Point(4.5,5.5);
		p2.printPoint();

	}

}
