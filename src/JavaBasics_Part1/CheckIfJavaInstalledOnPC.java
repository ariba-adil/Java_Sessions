package JavaBasics_Part1;

public class CheckIfJavaInstalledOnPC {

	public static void main(String[] args) {
		//It uses System.getProperty() to access and retrieve specific Java system properties
		
		// Display Java version
        System.out.println("Java Version: " + System.getProperty("java.version"));
        
        // Display Java runtime version
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        
        // Display Java home directory
        System.out.println("Java Home: " + System.getProperty("java.home"));
        
        // Display Java vendor name
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        
        // Display Java vendor URL
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        
        // Display Java class path
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

	}

}
