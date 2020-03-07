import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {
    public static void main(String [] aStrings) throws IOException{
        // Enter data using buffredReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        //Reading data using readline
        String name = reader.readLine();

        //printing out the readline
        System.out.println(name);
    }
}