
package javabasic;

import java.util.Random;
import java.util.Scanner;


public class RandomNumberDemo {
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your copon number between 0 to 100 : ");
        
        int uNumber = sc.nextInt();
        
        int genNumber = rand.nextInt(100)+1;
        
        if(uNumber==genNumber){
            System.out.println("You are Win the lottery");
        }else if(uNumber>genNumber){
            System.out.println("Your number is grater than Win number"+"Lucy number is "+genNumber);
        }else{
            System.out.println("Your number is grater than Win number"+"Lucy number is "+genNumber);
        }
       
        
        
    }
}
