package JavaBasics_Part1;

public class Area_Perimeter_Circle {
	private static final double radius = 7.5;
	//final double radius = 7.5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//radius = 7.5
		
		//final double radius = 7.5;
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
				
		System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
				

	}

}
