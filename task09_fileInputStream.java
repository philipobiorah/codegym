/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;
import java.io.*;
/**
 *
 * @author ATIMOR
 */
public class task09_fileInputStream {

    private static InputStream fileInputStream;
    private static OutputStream fileOutputStream;
    private static int count;
     public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   try{
        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

         fileInputStream = getInputStream(sourceFileName);
         fileOutputStream = getOutputStream(destinationFileName);

         count = 0;
       
            while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
            } 
        }catch(FileNotFoundException e){
            System.out.print("File does not exist.");
        }finally{
           System.out.println("Bytes copied:"+ count);
           fileInputStream.close();
           fileOutputStream.close();  
        
        }
        

       
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
