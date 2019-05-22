package codegym.push.codegym;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATIMOR
 */
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Animal set

*/

public class AnimalSet_Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        
        //write your code here
         Cat cat1 = new Cat();
         Cat cat2 = new Cat();
         Cat cat3 = new Cat();
         Cat cat4 = new Cat(); 
         result.add(cat1);
         result.add(cat2);
         result.add(cat3);
         result.add(cat4);
           
        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
         result.add(dog1);
         result.add(dog2);
         result.add(dog3);
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
       Set<Object> pets = new HashSet<>();
    	Iterator<Cat> catIterator = cats.iterator();
    	Iterator<Dog> dogIterator = dogs.iterator();
    	
    	while(catIterator.hasNext()) {
    		pets.add(catIterator.next());
    	}
    	
    	while(dogIterator.hasNext()) {
    		pets.add(dogIterator.next());
    	}
        
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        for(Cat cat : cats){
            pets.remove(cat);
        }
       
    }
    

    public static void printPets(Set<Object> pets) {
        //write your code here
        for(Object o : pets){
            System.out.println(o.toString());
        }
    }

    //write your code here
    public static class Cat{
        
    }
    
    public static class Dog{
        
    }
}

