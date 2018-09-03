
package javabasic;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> myList = new ArrayList<>();
        
        myList.add(10);
        myList.add(1);
        myList.add(15);
        myList.add(19);
        myList.add(4,88);
        
        
//        myList.remove(2);

        Collections.reverse(myList);
        
        System.out.println(myList);
    }
}
