import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;
public class write_byte_file {
    public static void main(String[] args)
    {
        try{
            FileOutputStream Fo = new FileOutputStream("output.txt");
            BufferedOutputStream Bo = new BufferedOutputStream(Fo);
            String line = "Hello World!";
            byte[] b = line.getBytes();
            Bo.write(b);
            Bo.close();
            Fo.close();
           }
           catch(IOException e)
           {
            e.getStackTrace();
           }
    }
}
