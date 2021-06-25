interface printable {
	void print();
}

class A6 implements printable {
	public void print() {
		System.out.println("My Name is Bhanu Teja");
	}

	public static void main(String args[]) {
		A6 obj = new A6();
		obj.print();
	}
}
