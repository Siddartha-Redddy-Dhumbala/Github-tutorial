
public class StaticFive {
static int x=10;
void nonstaticmethod() {
	x=20;
	System.out.println("x= "+x);
	staticMethod();
}
public static void staticMethod() {
	x = 30;
	
}
public static void main(String[] args) {
	StaticFive sfi = new StaticFive();
	System.out.println("x= "+x);
	sfi.nonstaticmethod();
	System.out.println("x= "+x);
}
}
