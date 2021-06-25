
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class BufferedInputStreamExample {
 
    public static void main(String[] args) {
 
        File file = new File("C:\\Users\\Admin\\Desktop\\Bhanu.txt");
        BufferedInputStream bis = null;
 
        try {
            FileInputStream fis = new FileInputStream(file);
 
            bis = new BufferedInputStream(fis);
 
            byte[] buffer = new byte[1024];
 
            int bytes = 0;
            String fileContent;
 
            while ((bytes = bis.read(buffer)) != -1) {
                fileContent = new String(buffer, 0, bytes);
                System.out.print(fileContent);
            }
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
 
        }
    }
}