
public class Protected {
	protected int age = 29;
	protected char letter = 'C';

	protected void display1() {
		System.out.println("Protected Method");
	}

	class ProtectedTwo extends Protected {
		public void main(String[] args) {

			Protected ob1 = new Protected();
			System.out.println(ob1.age);
			System.out.println(ob1.letter);
			ob1.display1();

		}
	}
}
