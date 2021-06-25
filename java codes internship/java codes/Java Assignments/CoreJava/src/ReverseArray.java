
public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 4, 6, 8 };
		System.out.println("Original Array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Array in reverse order is ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + " ");
		}
	}
}
