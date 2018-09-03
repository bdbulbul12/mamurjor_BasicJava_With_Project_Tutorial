
package javabasic;

import java.util.Scanner;


public class GradingSystem {
    
    public static void main(String[] args) {
        
        int marks;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Marks : ");
        
        marks = sc.nextInt();
        
        if(marks >=0 && marks <=32 ){
            System.out.println("Your Grade is F ");
        }
        else if(marks>=33 && marks <=39){
             System.out.println("Your Grade is D ");
        }
        
        else if(marks>=40 && marks <=49){
             System.out.println("Your Grade is C ");
        }
        
        else if(marks>=50 && marks <=59){
             System.out.println("Your Grade is B ");
        }
        
        else if(marks>=60 && marks <=69){
             System.out.println("Your Grade is A- ");
        }
        
        else if(marks>=70 && marks <=79){
             System.out.println("Your Grade is A ");
        }
        
        else if(marks>=80 && marks <=100){
             System.out.println("Your Grade is A+ ");
        }
        
        else{
            System.out.println("Invalid Marks ");
        }
    }
}
