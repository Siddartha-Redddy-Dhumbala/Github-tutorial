public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			System.out.println("Result: " + a/b);
		} catch (ArithmeticException ae) {
			System.out.println("Arithmetic Exception: cannot divide by 0");
		}
		System.out.println("Continuing execution...");
	}
}