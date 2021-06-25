
public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {
		String str = "My name is Bhanu";
		System.out.println("Length of the String: " + str.length());
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println(str.charAt(40));
	}
}
