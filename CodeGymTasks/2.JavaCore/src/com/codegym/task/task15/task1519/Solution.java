package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        String s;
        while ((s = br.readLine()) != null ){

             if(s.equals("exit")){
                 break;
             }else {
                 try{
                 if(s.contains(".")){
                  print(Double.parseDouble(s));
                 }else {

                         int n = Integer.parseInt(s);
                         if (n > 0 && n < 128) {
                             print(Short.parseShort(s));
                             //less than or equal to zero or greater than or equal to 128, then call the print method for Integer;
                         } else if (n <= 0 || n >= 128) {
                             print(Integer.parseInt(s));
                         }
                     }


                 }catch (NumberFormatException nfe){
                     print(s);
                 }


                 }

             }
        }


    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
