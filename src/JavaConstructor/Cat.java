package JavaConstructor;
//default constructor

public class Cat {

		// TODO Auto-generated method stub
		private String name;
		private int age;

	
	public Cat() {
		this.name = "Unknown";
		this.age = 0;
		
	}	
	
	public static void main(String[] args) {
		Cat c = new Cat();
		System.out.println("Cat's name : " + c.name);
		System.out.println("Cat's age : " + c.age);
	}
	}


