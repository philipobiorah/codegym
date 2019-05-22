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
public class Solution2 {
    public static void main(String[] args) {
         displayClosestToTen(9, 11);
         displayClosestToTen(7, 14);
        
    }

    public static void displayClosestToTen(int a, int b) {
        // write your code here
        int diffa = a - 10;    //   9 - 10  = -1
        int diffb = b - 10;    //   11 -10   1
        
        if(abs(diffa) > abs(diffb)){
            System.out.println("b: "+ b);
        }else if(abs(diffb) > abs(diffa)){
             System.out.println("a:" + a);
        }else {
             System.out.println(b);
             System.out.println(a);
              
        }
        

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}