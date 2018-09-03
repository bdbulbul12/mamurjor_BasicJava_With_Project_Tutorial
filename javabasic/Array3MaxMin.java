
package javabasic;

import java.util.Scanner;


public class Array3MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double [] myArray = new double[5];
        
        
        System.out.print("Enter five numbers : ");
        
        
        
        for (int i = 0; i <myArray.length; i++) {
            
            myArray[i] = sc.nextDouble();  
        }
        
        double max= myArray[0];
        double min = myArray[0];
        
        for (int i = 0; i <myArray.length; i++) {
            
            //5 6 8 9 6
            
            if(myArray[i]>max){
                max=myArray[i];
            }
            if(myArray[i]<min){
                min=myArray[i];
            }
        }
        
        System.out.println("Maximum number is : "+max);
        System.out.println("Minimum number is : "+min);
    }
}
