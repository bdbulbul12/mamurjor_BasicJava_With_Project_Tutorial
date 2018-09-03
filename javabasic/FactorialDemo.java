
package javabasic;

import java.util.Scanner;


public class FactorialDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int fact =1;
        System.out.print("Enter any positive Number : ");
        
        int n = sc.nextInt();
        
        for (int i = n; i >=1; i--) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is :"+fact);
    }
}
