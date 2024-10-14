
package JavaStaticMembers;

public class StaticBlockForInitialization {
	public static String configValue;
	
	static {
		configValue = "Default Config Value";
        System.out.println("Static block executed: configValue initialized");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Config Value: " + configValue);

	}

}
