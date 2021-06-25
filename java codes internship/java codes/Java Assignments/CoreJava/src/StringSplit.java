
public class StringSplit {
	public static void main(String args[]) {
		String str = "Bhanu@Teja";
		String[] arrOfStr = str.split("@", 2);

		for (String a : arrOfStr)
			System.out.println(a);
	}
}
