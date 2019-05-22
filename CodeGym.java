/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ATIMOR
 */
public class CodeGym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
 
        String grandfatherName = reader.readLine();
        String grandmotherName = reader.readLine();
        Cat catgrandFather = new Cat(grandfatherName);
        Cat catgrandMother = new Cat(grandmotherName);
 
       
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catgrandFather);
        Cat catMother = new Cat(motherName, catgrandMother);
        
        String sonName = reader.readLine();
        String daughterName = reader.readLine();
        Cat catSon =new Cat(sonName, catFather, catMother);
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        //grandfather, grandmother, father, mother, son, daughter
        System.out.println(catgrandFather);
        System.out.println(catgrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }
    }
    
    
    
    
     
