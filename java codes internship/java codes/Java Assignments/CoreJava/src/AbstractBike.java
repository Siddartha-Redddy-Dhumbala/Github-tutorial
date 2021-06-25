
abstract class AbstractBike {

	abstract void run();
}

class Honda4 extends AbstractBike {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		AbstractBike obj = new Honda4();
		obj.run();
	}
}
