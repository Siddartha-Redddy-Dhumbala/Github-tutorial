
public interface InterfaceOne {
	void print();
}

class B6 implements printable {
	public void print() {
		System.out.println("Hello, I am Bhanu teja");
	}

	public static void main(String args[]) {
		A6 obj = new A6();
		obj.print();
	}
}
