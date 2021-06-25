
public interface InterfaceFour {
	void print();  
	}  
	interface Showable{  
	void show();  
	}  
	class A7 implements InterfaceFour,Showable{  
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("i am Bhanu Teja");}  
	  
	public static void main(String args[]){  
	A7 obj = new A7();  
	obj.print();  
	obj.show();  
	 }  
}
