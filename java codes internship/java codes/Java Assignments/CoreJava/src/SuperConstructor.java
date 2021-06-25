
public class SuperConstructor {

	SuperConstructor() {
		System.out.println("SuperConstructor is created");
	}
}

class CarOne extends SuperConstructor {
	CarOne() {
		super();
		System.out.println("Car is created");
	}
}

class Super {
	public static void main(String args[]) {
		CarOne d = new CarOne();
	}

}
