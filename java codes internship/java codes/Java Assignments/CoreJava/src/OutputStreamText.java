import java.io.FileOutputStream;
public class OutputStreamText {
	  
	public class FileOutputStreamExample {  
	    public void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Bhanu.txt");    
	             fout.write(65);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
	}  
}
