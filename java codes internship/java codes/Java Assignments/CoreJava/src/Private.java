
public class Private {
private int age = 19;
private char letter = 'B';

private void display() {
	System.out.println("Private Method");
}}
public class Tester extends Private{
public static void main(String[] args) {
	Private t1 = new Private();
	System.out.println(t1.age + t1.letter);
	t1.display();
}
}
