
public class ArraySum {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 66, 77, 88, 99, 10 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The Sum of Array is: " + sum);
	}
}
