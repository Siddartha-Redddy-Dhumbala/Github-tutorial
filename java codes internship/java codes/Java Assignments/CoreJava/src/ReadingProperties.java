
import java.util.*;  
import java.io.*;  
public class ReadingProperties {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("C:\\Users\\Admin\\Desktop\\bt.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
      
    System.out.println(p.getProperty("user"));  
    System.out.println(p.getProperty("password"));  
}  
}  
