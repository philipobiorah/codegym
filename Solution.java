/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations
The cat's name is Grandfather Tiger, no mother, no father
The cat's name is Grandmother Puss, no mother, no father
The cat's name is Father Oscar, no mother, Grandfather Tiger is the father
The cat's name is Mother Missy, Grandmother Puss is the mother, no father
The cat's name is Son Simba, Mother Missy is the mother, Father Oscar is the father
The cat's name is Daughter Coco, Mother Missy is the mother, Father Oscar is the father

*/

public class Solution {
    public static void main(String[] args) throws IOException {
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

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }
         Cat(String name, Cat parent) {
            this.name = name;
            if(parent.name == father.name){
                this.father = parent;
            }else{
                this.mother = parent;
            }
            
            
        }
        

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother "+ ", no father ";
            else if(father == null && mother != null)
                return "The cat's name is " + name + "," + mother.name + " is the mother "+ ", no father ";
            else if(father != null && mother == null)
                return "The cat's name is " + name +", no mother, "+ father.name+" is the father";
            else if(father != null && mother != null )   
                return "The cat's name is " + name + ", " + mother.name + " is the mother "+ father.name + " is the father";
            else return "";
        }
    }

}
