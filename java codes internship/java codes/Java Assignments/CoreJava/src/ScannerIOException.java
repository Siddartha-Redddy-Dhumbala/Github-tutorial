import java.util.*;

public class ScannerIOException {

	public static void main(String[] args) {

		Scanner scan = new Scanner("Hello Everyone, I am Bhanu Teja");

		System.out.println("" + scan.nextLine());

		System.out.println("Exception Output: " + scan.ioException());
		scan.close();
	}
}
