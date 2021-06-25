
import java.io.*;

class Teja {

	public int add1(int a, int b) {

		int sum = a + b;
		return sum;
	}

	public double add1(int a, int b) {
		double sum = a + b + 0.0;
		return sum;
	}
}

class ABC {
	public static void main(String[] args) {
		try {
			Teja ob = new Teja();

			int sum1 = ob.add1(1, 2);
			System.out.println("sum of the two integer value :" + sum1);

			int sum2 = ob.add1(1, 2);
			System.out.println("sum of the three integer value :" + sum2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}