
public class ClassNotFound {

	public static void main(String args[]) {
		try {
			Class.forName("Bhanu Teja");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
