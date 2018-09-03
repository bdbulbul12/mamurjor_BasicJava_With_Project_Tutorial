
package javabasic;

import java.util.Scanner;


public class FibbDemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number :");
        
        int n = sc.nextInt();
        
        int firstNum=0,secondNumber=1,fibo;
        
        System.out.print(firstNum+" "+secondNumber);
        
        for (int i = 3; i <=n; i++) {
            
            fibo=firstNum+secondNumber;
            System.out.print(" "+fibo);
            
            firstNum=secondNumber;
            secondNumber=fibo;
            
        }
    }
}
