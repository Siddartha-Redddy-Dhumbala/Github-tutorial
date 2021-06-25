
class Example {

	Example() {
		System.out.println("Default constructor");
	}

	Example(int i) {
		System.out.println("constructor with one parameters");
	}

	Example(int i, int j) {
		System.out.println("constructor with Two parameters");
	}

	public static void main(String args[]) {

		Example obj = new Example(10);

		Example obj2 = new Example(12, 12);

		
	}
}