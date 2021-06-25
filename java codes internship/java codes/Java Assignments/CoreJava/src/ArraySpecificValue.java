
public class ArraySpecificValue {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int ToFind = 7;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (i == ToFind) {
				found = true;
				break;
			}
		}
		if (found)
			System.out.println("Found " + ToFind);

		else
			System.out.println("Not Found " + ToFind);

	}
}
