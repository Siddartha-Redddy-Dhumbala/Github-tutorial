
public class ThisParameterized {

	private int x, y;
	private int width, height;

	public ThisParameterized() {
		this(0, 0, 1, 1);
	}

	public ThisParameterized(int width, int height) {
		this(0, 0, width, height);
	}

	public ThisParameterized(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
