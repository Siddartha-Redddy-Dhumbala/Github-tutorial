
public class EqualsIgnoreCase {
	public static void main(String args[]){  
		String s1="BhanuTeja";  
		String s2="BhanuTeja";  
		String s3="BHANUTEJA";  
		String s4="Java";  
		System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same  
		}
}
