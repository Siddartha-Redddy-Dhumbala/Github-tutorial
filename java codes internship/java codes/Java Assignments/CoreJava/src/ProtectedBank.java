
protected public interface ProtectedBank {
	protected float rateOfInterest();
}

class SBI2 implements Bank {
	protected float rateOfInterest() {
		return 9.15f;
	}
}

class PNB2 implements Bank {
	protected float rateOfInterest() {
		return 9.7f;
	}
}

class TestInterface4 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI: " + b.rateOfInterest());
	}
}
