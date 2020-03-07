import java.io.InputStreamReader;
import java.io.BufferedReader;
 
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    public static void main(String[] args) throws IOException{
    //   File file = new File("/home/philip/codegym/text.txt");
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("Pls enter file path:");
    
     String file = br.readLine();
     BufferedReader nbr = new BufferedReader(new FileReader(file));
      String st;
      while ((st = nbr.readLine()) != null){
          System.out.println(st);
      }

      br.close();
      nbr.close(); 
    }
}