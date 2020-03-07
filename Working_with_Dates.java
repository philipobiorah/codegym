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
//public class Working_with_Dates {
//    
//}
import java.util.Date;

/* 
Working with dates

*/
import java.util.Date;
public class Working_with_Dates{
    public static void main(String[] args) {
//        System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        if(date1.getTime() % 2 != 0){
            return true;
 
    }else{
            return false;
        }
}


}

