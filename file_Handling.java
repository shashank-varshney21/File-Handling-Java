import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class file_Handling {
    public static void main(String[] args)
    {
        try{
            FileWriter fw = new FileWriter("output.txt");
            // Create a BufferedWriter
            BufferedWriter BW = new BufferedWriter(fw);
            BW.write("Shashank the saka founder");
            BW.close();
            fw.close();    
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
