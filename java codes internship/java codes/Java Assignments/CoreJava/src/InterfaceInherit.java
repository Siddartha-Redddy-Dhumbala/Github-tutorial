
public interface InterfaceInherit {
	void print();
}

interface Showables extends InterfaceInherit {
	void show();
}

class TestInterface4 implements Showables {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Bye");
	}

	public static void main(String args[]) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
	}
}
