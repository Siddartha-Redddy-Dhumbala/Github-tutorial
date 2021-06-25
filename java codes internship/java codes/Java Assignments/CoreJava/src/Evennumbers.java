
public class Evennumbers {
	public static void main(String[] args) {
		int k = 100;
		System.out.println("Even numbers from 1 to " + k + " are: ");
		for (int i = 1; i <= k; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
	}

}
