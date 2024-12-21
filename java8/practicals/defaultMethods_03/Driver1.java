package defaultsMethod;

public class Driver1 {
	public static void main(String[] args) {
		new Human().walk();
		new Cat().walk();
		new Goat().walk();
	}
}

interface Animal {
	default void walk() {
		System.out.println("Walking on 4 legs..!");
	}
	void eat();
	void sound();
}

class Human implements Animal {

	public void walk() {
		System.out.println("Walking on 2 legs..!");
	}

	@Override
	public void eat() {
		System.out.println(" eat both..!");
	}

	@Override
	public void sound() {
		System.out.println(" eat both..!");
	}
}

class Cat implements Animal {
	@Override
	public void eat() {
		System.out.println(" eat both..!");
	}

	@Override
	public void sound() {
		System.out.println(" eat both..!");
	}
}

class Goat implements Animal {
	@Override
	public void eat() {
		System.out.println(" eat both..!");
	}
	@Override
	public void sound() {
		System.out.println(" eat both..!");
	}
}
 