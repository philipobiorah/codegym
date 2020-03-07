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
public class Sorting {

    private static int temp;
    public static void main(String [] args){
        int [] num = {2, 3,4,5,6,6,6,7,1,3};
        
        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j < num.length; j++){
                if(num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        
        
        System.out.println("Sorted");
        for(int x : num){
            
            System.out.println(x);
        }
        
    }
    
   
 
    
}
