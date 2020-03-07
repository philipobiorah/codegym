import java.io.*;


public class ReadFileInputStream {
    public static void main(String [] args)throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String filename = r.readLine();
        FileInputStream fs = new FileInputStream(filename);
        BufferedReader br =  new BufferedReader(new InputStreamReader(fs)) ;
        
         String line;
         while((line = br.readLine()) != null){
             System.out.println(line);
         }
        r.close();
        br.close();
        fs.close();
    }
}