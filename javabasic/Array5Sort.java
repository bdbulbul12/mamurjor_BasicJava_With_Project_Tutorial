
package javabasic;

import java.util.Arrays;


public class Array5Sort {
    public static void main(String[] args) {
        
        int [] x ={5,8,6,9,2};
        
        Arrays.sort(x);
        
        System.out.print("Ascending Order :");
        for (int i = 0; i < 5; i++) {
            
            System.out.print(" "+x[i]);
        }
        
        System.out.println("");
        System.out.print("Descending Order : ");
        
        
        
        for (int i = 4; i >=0; i--) {
             System.out.print(" "+x[i]);
        }
    }
}
