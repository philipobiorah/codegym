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



import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class  haspMap_Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        Map<String, String> map = new HashMap<String, String>();
        map.put("Obiorah", "Philip");
        map.put("Obidiozor", "Marius");
        map.put("Ochada", "Paul");
        map.put("Obineme", "Emmanuel");
        map.put("Oputa", "JohnMelvin");
        map.put("Okafor", "John");
        map.put("Okafor", "Calistus");
        map.put("Opaselenge", "Bornto");
        map.put("Onyeogubalu", "JohnPaul");
        map.put("Enemuo", "JohnPaul");
        map.put("Onwumelu","Charles");
        

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
