
import java.io.*;

public class BufferedWriterExample {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\Bhanu.txt");
		BufferedWriter buffer = new BufferedWriter(writer);
		buffer.write("Welcome to Bhanu's Program");
		buffer.close();
		System.out.println("Overwrite Successful :)");
	}
}