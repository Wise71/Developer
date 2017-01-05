package demo.tool;

public class Animal {
	public Animal() {
		System.out.println("Creating Animal");
	}
}

class Hippo extends Animal {
	public Hippo() {
		System.out.println("Creating Hippo");
	}
}

class Canine extends Animal {
	public Canine() {
		System.out.println("Canine");
	}
}

class Dog extends Canine {
	public Dog() {
		this("Small");
		System.out.println("Dog");
	}
	public Dog(String Smaller) {
		System.out.println(Smaller);
	}
}

class TestHippo {
	public static void main(String[]args) {
		System.out.println("Starting...");
		Animal d = new Dog();
	}
}