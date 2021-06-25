
public class PrivateConstructor {

	private PrivateConstructor() {
		System.out.println("I'm a private constructor");
	}

	public static PrivateConstructor getObject() {

		if (ref == null)
			ref = new PrivateConstructor();
		return ref;
	}

	private static PrivateConstructor ref;
}

class PrivateConstructorDemo {
	public static void main(String args[]) {
		PrivateConstructor sObj = PrivateConstructor.getObject();
	}
}
