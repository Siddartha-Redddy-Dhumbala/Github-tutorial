
public class ArrayAvg {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 99 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum = sum + arr[i];
		double avg = sum / arr.length;

		System.out.println("Average of Array is: " + avg);

	}
}
