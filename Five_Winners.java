/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Five winners

*/

public class Five_Winners {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            list.add(array[i]);
        }
       Collections.sort(list);
       Collections.reverse(list);
       for(int i = 0;i < list.size(); i++){
           array[i] = list.get(i);
       }
        
        
    }
}
