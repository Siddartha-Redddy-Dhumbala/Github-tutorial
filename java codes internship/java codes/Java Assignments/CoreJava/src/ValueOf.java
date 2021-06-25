
public class ValueOf {
	public static void main(String[] args){
	    
	    Integer i = new Integer(123);

	    System.out.println("Before conversion: " + i.getClass().getName());
	    
	    System.out.println("After conversion: " + String.valueOf(i).getClass().getName());
	  }
}
