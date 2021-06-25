
public class StringMatches {
	public static void main(String args[]) {

		// Initializing String
		String Str = new String("My name is Bhanu Teja");

		// Testing if regex is present
		System.out.print("Does String contains regex Bhanu ? : ");
		System.out.println(Str.matches("(.*)Bhanu(.*)"));

		// Testing if regex is present
		System.out.print("Does String contains regex Masanth ? : ");
		System.out.println(Str.matches("Masanth"));

	}
}
