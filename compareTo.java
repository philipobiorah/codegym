/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;

/**
 *
 * @author ATIMOR
 */
public class compareTo {

    private static String temp;
    
    
    
    
     public static void sort(String[] array) {
        //write your code here
        
        
         
        for(int i = 0; i < array.length; i++){
           for(int j = i+1; j < array.length; j++){
               if(isGreaterThan(array[i], array[j])){
                  temp = array[i];
                  array[i] = array[j];
                  array[j] = temp;
               }
              
           }
           
        }
        
        System.out.println("Sorted");
        for(String x : array){
            System.out.println(x);
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    
    
    public static void main(String [] args){
        String [] friends = {"z", "a", "g"};
        sort(friends);
    }
}
