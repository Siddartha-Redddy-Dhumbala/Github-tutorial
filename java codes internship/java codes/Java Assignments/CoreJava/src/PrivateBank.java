
private public interface PrivateBank {
	private float rateOfInterest();
}

class SBI1 implements Bank {
	private float rateOfInterest() {
		return 9.15f;
	}
}

class PNB1 implements Bank {
	private float rateOfInterest() {
		return 9.7f;
	}
}

class TestInterface3 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
