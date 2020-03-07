import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.*;


public class ReadWriteFile {
    
    public static void main(String [] aStrings) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter destination path:");
         String filename = br.readLine();
         FileWriter fw = new FileWriter(filename);

         BufferedWriter bw = new BufferedWriter(fw);
         BufferedReader bbr = new BufferedReader(new  InputStreamReader(System.in));
         System.out.println("Enter text: ");
         String line;
         while((line = bbr.readLine()) !=null){
                bw.write(line);
         }

       fw.flush();
       br.close();
       bbr.close();
         
    }
}

