
package javabasic;

import java.util.Scanner;


public class SwitchDemo {
    public static void main(String[] args) {
        
        int selector;
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your Option"+"\n 1.Send Money \n 2.Buy AirTime"
        +"\n 3.Payment \n 4.Logout");
        
        System.out.println("==========================================================");
        
        selector = sc.nextInt();
        
        switch(selector){
            case 1:
                System.out.println("Send Money Success");
                break;
            case 2 :
                System.out.println("Buy airtime Success");
                break;
            case 3:
                System.out.println("Payment Sucess");
                break;
            case 4:
                System.out.println("Logout success");
                break;
            default:
                System.out.println("Invalid selector");
                break;
        }
    }
}
