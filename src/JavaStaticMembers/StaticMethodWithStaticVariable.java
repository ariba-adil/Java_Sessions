package JavaStaticMembers;

public class StaticMethodWithStaticVariable {
	public static int nextID = 1;
	
	public static int generateID() {
		return(nextID++);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Generated ID: " + StaticMethodWithStaticVariable.generateID());
		System.out.println("Generated ID: " + StaticMethodWithStaticVariable.generateID());
		System.out.println("Generated ID: " + StaticMethodWithStaticVariable.generateID());

	}

}
