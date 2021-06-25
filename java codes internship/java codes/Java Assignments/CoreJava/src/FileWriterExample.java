
import java.io.FileWriter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\\Users\\Admin\\Desktop\\Bhanu.txt");    
           fw.write("I am Bhanu");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Congrats on program's success");    
     }    
}  