package JavaStaticMembers;

public class StaticBlock {
	private static int initialValue;
	
	static {
		initialValue = 1000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating an instance: initialValue = " + StaticBlock.initialValue);
		StaticBlock sb = new StaticBlock();
		System.out.println("After creating an instance: initialValue = " + StaticBlock.initialValue);

	}

}
