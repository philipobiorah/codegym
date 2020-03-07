import java.io.*;

public class ConsoleRead {
    public static void main(String []args){
     try{
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          File file  = new File(br.readLine()); //reading file name form console

          FileWriter fw = new FileWriter(file); // A stream that conncts  to the text file
          BufferedWriter bw = new BufferedWriter(fw); //connect the FileWriter to the BufferedWriter
          BufferedReader bbr = new BufferedReader(new InputStreamReader(System.in)); // a stream reading from the console
          String line;
          boolean active = true;
          while(active){
              line = bbr.readLine();
              bw.write(line);
              bw.newLine();
              if(line.equals("exit")){
                  active = false;
              }
          }
          br.close();
          bbr.close();
          bw.close();
          
     }catch(Exception e)  {
         e.printStackTrace();
     }
       
    }
}