
public interface InterfaceStatic {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle1 implements InterfaceStatic {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceStatic {
	public static void main(String args[]) {
		InterfaceStatic d = new Rectangle1();
		d.draw();
		System.out.println(InterfaceStatic.cube(3));
	}
}
