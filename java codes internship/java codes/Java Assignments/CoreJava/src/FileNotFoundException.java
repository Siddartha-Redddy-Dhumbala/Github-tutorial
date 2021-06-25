

	import java.io.*;
	  
	public class FileNotFoundException 
	{
	  public static void main(String[] args) 
	  {
	         
	   
	    FileReader reader = new FileReader("file.txt");
	      
	  
	    
	    BufferedReader br = new BufferedReader(reader);
	      
	    
	    String data =null;
	      
	    
	    
	    while ((data = br.readLine()) != null) 
	    {
	        System.out.println(data);
	    }
	      
	   
	    br.close();
	  }
	
	
	
	
	
	
