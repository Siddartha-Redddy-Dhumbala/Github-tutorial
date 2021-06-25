
public class Default {
	int age = 19;
	char letter = 'B';

	void m1() {
		System.out.println("Default Method");
	}
}

class DefaultTwo extends Default {
	public void main(String[] args) {

		Default obj1 = new Default();
		System.out.println(obj1.age);

		System.out.println(obj1.letter);
		obj1.m1();
	}
}
