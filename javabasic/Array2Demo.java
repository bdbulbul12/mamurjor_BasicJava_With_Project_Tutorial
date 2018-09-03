
package javabasic;

import java.util.Scanner;


public class Array2Demo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double [] myArray = new double[4];
        double summation=0;
        
        System.out.print("Enter four numbers : ");
        
        for (int i = 0; i <myArray.length; i++) {
            
            myArray[i] = sc.nextDouble();  
        }
        
        for (int i = 0; i <myArray.length; i++) {
            
            summation = summation+myArray[i];
        }
        
       
        
        System.out.println("Summation is : "+summation);
        System.out.println("Average is :"+summation/myArray.length);
        
        
        
    }
}
