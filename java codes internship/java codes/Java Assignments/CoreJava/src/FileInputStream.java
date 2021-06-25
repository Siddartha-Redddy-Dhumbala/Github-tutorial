import java.io.*;
public class FileInputStream
{
  public static void main(String[] args) throws Exception
  {
    // pass the path to the file as a parameter
    FileReader fr =
      new FileReader("C:\\Users\\Admin\\Desktop\\Bhanu.txt");
  
    int i;
    while ((i=fr.read()) != -1)
      System.out.print((char) i);
  }
}