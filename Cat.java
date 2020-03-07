/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegym.push.codegym;

public class Cat {
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
            this.parent = parent;
            
        }
         
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother "+ ", no father ";
            else if(father == null && mother != null)
                return "The cat's name is " + name + "," + parent.name + " is the mother "+ ", no father ";
            else if(father != null && mother == null)
                return "The cat's name is " + name +", no mother, "+parent.name+" is the father";
            else     
                return "The cat's name is " + name + ", " + mother.name + " is the mother "+ father.name + " is the father";
        }
     }   
