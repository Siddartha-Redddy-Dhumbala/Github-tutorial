
public interface InterfaceTwo {
	void scan();

	void print();
}

class B8 implements printable {
	public void print() {
		System.out.println("Hello, I am Bhanu teja");
	}

	public static void main(String args[]) {
		A6 obj = new A6();
		obj.print();
	}
}
