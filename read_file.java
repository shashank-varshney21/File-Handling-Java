import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class read_file {
    public static void main(String[] args)
    {
        try{
            FileReader Fr = new FileReader("output.txt");
            BufferedReader Br = new BufferedReader(Fr);
            String line;
            while((line = Br.readLine())!=null)
            {
                System.out.println(line);
            }
            Br.close();
            Fr.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
    }
}
