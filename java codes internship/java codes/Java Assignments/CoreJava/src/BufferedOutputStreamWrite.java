
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutputStreamWrite {
    public static void main(String[] args) {

        String data = "My name is Bhanu Teja";

        try {
           
            FileOutputStream file = new FileOutputStream("C:\\Users\\Admin\\Desktop\\Bhanu.txt");

            
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

           
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}