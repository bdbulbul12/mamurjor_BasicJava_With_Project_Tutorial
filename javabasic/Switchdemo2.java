
package javabasic;

import java.util.Scanner;


public class Switchdemo2 {
    public static void main(String[] args) {
        
        int num1,num2;
        char sign;
        
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter First number : ");
        num1=sc.nextInt();
        
        System.out.print("Enter your Selection  +,-,*, /"+"\n");
        sign=sc.next().charAt(0);
        
        System.out.print("Enter second Number : ");
        num2=sc.nextInt();
        
        switch(sign){
            
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
                
            default:
                System.out.println("Invalid sign");
                break;
                
        }
       
    }
}
