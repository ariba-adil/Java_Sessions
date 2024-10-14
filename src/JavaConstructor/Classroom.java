package JavaConstructor;
//Constructor with Array Initialization

public class Classroom {
	private String className;
	private String[] students;
	
	public Classroom(String className, String[] students) {
		this.className = className;
		this.students = students;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studArray[] = {"Tom", "Dick", "Harry"};
		Classroom cr1 = new Classroom("BCA", studArray);
		System.out.println(cr1.className);
		System.out.println("Students: ");
		for(int i=0; i<studArray.length; i++) {
			System.out.println(studArray[i]);
		}

	}

}
