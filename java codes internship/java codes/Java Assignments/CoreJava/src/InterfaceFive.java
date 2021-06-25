
public interface InterfaceFive {

	int f();
}

interface B {
	int f();
}

class Test implements InterfaceFive, B {
	public static void main(String... args) throws Exception {

	}

	public int f() {
		return 0;
	}
}
