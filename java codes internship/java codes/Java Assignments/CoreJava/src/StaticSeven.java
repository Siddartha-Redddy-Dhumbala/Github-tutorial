
public class StaticSeven {
	void display()  
	{  
	System.out.println("A non-static function is called.");  
	}  
	 
	static void show()  
	{  
	System.out.println("The static function is called.");      
	}  
	}  
	public class Demo  
	{  
	public static void main(String args[])  
	{  
	
	StaticSeven obj = new StaticSeven();  
	
	obj.display();  
	  
	StaticSeven.show();  
	}  
}
