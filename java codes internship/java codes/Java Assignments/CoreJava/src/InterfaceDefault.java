
public interface InterfaceDefault {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class Rectangle implements InterfaceDefault {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		InterfaceDefault d = new Rectangle();
		d.draw();
		d.msg();
	}
}
