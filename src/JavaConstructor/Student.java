package JavaConstructor;
//chaining constructors

public class Student {
	
	private int studentId;
	private String studentName;
	private String grade;
	
	public Student() {
		this.studentId = 0;
		this.studentName = "Unknown";
		this.grade = "Unknown";
	}
	
	public Student(int studentId, String studentName, String grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("Student1 id : " + s1.studentId);
		System.out.println("Student1 name : " + s1.studentName);
		System.out.println("Student1 grade : " + s1.grade);
		
		Student s2 = new Student(101, "Cullen", "A") ;
	    System.out.println("Student2 id : " + s2.studentId);
		System.out.println("Student2 name : " + s2.studentName);
		System.out.println("Student2 grade : " + s2.grade);
	}

}
