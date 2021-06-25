import java.util.Scanner;

public class CustomExceptionMessage {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("The result is: " + c);
		} catch (ArithmeticException e) {
			System.out.println("Output of printStackTrace() method: ");
			e.printStackTrace();
			System.out.println(" ");
			System.out.println("Output of getMessage() method: ");
			System.out.println(e.getMessage());
			System.out.println(" ");
			System.out.println("Output of toString() method: ");
			System.out.println(e.toString());
		}
	}
}
