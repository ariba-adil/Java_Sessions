package JavaConstructor;
//parametrized constructor

public class Dog {
	
	private String name;
	private String color;
	
	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public static void main(String[] args) {
		Dog d = new Dog("Bailey", "Black");
		System.out.println("Dog's name : " + d.name);
		System.out.println("Dog's color : " + d.color);

	}

}
