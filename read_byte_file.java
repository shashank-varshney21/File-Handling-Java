import java.io.IOException;
import java.io.FileInputStream;
public class read_byte_file {
    public static void main(String[] args)
    {
        try{
            FileInputStream Fi = new FileInputStream("output.txt");
            int line;
            while((line = Fi.read())!=-1)
            {
                System.out.print((char)line);
            }
            Fi.close();
        }catch(IOException e)
        {
            e.getStackTrace();
        }
    }
    
}
