package JavaStaticMembers;

public class StaticVariables {
	private static int count = 0;
	
	StaticVariables() {
		count = count+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables c1 = new StaticVariables();
		StaticVariables c2 = new StaticVariables();
		StaticVariables c3 = new StaticVariables();
		System.out.println(count);

	}

}
