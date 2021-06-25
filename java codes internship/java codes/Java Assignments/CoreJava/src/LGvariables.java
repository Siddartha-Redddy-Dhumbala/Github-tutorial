
public class LGvariables {
	public static int num; // global variable

	void num() {
		int num = 1;
		num = num + 8;
		System.out.println("num is " + num); // Local variable
	}

	public static void main(String[] args) {
		LGvariables n = new LGvariables();
		n.num();

	}
}
