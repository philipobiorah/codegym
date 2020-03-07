/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Obiorah Philip
There is a Cat class with a String variablename.
Create a Map<String, Cat> and add 10 cats represented by (name, Cat) pairs.
Get a Set of all cats from the Map and display it on the screen.
 */


public class TenCats_HashMap {
     public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Busu");
        Cat cat2 = new Cat("Pussy");
        Cat cat3 = new Cat("PussyCat");
        Cat cat4 = new Cat("BussyCat");
        Cat cat5 = new Cat("FuzzyCat");
        Cat cat6 = new Cat("WhitePussy");
        Cat cat7 = new Cat("RedPussy");
        Cat cat8 = new Cat("BlackPussy");
        Cat cat9 = new Cat("Philips Cat");
        Cat cat10 = new Cat("Mum's Cat");
        map.put(cat1.name, cat1);
        map.put(cat2.name, cat2);
        map.put(cat3.name, cat3);
        map.put(cat4.name, cat4);
        map.put(cat5.name, cat5);
        map.put(cat6.name, cat6);
        map.put(cat7.name, cat7);
        map.put(cat8.name, cat8);
        map.put(cat9.name, cat9);
        map.put(cat10.name, cat10);
        return map;
    }
    

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        Set<Cat> keyset =  new HashSet<Cat>(map.values());
      
        return keyset;
      
    }

    public static void printCatSet(Set<Cat> set) {
         for (Cat cat : set) {
             System.out.println(cat);
         }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
