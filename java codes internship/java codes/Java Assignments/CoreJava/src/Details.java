

public abstract class Details {
abstract void name();
}
class Info extends Details{
	void name() {
	System.out.println("My name is Bhanu Teja");
	}
	public static void main(String[] args) {
		Details obj = new Info();
		obj.name();
	}
		
	
 
	}
	
	

