/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;

import java.util.ArrayList;

/**
 *
 * @author ATIMOR
 */
public class IntArrayArayList {
   public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        int [] a = {1,2,3,4,5};
        int [] b = {0,1};
        int [] c = {4,5,6,7};
        int [] d = {7,8,9,10,11,12,13};
        int [] e = {};
        
        ArrayList<int[]> list  = new ArrayList<int[]>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        
        
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.print(x);
            }
            System.out.println();
        }
    } 
}
