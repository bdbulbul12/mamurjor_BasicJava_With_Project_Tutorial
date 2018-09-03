
package javabasic;

import java.util.Scanner;


public class FibonecciDemo {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number");
        
        int n = sc.nextInt();
        
        int first =0,second=1,fibo;
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <=n; i++) {
            fibo = first+second;
            System.out.print(" "+fibo);
            first=second;
            second=fibo;
            
        }
        
    }
}
