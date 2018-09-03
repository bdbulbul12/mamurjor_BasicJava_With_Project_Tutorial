
package javabasic;


public class String2Demo {
    public static void main(String[] args) {
        
        
        String fName = "Bulbul";
        String lName = "Ahmed";
        
        String fullName=fName.concat(lName);
        
        System.out.println(fullName);
        int len=fullName.length();
        System.out.println(len);
        
        String Uname=fullName.toUpperCase();
        System.out.println(Uname);
        String Uname2=fullName.toLowerCase();
        System.out.println(Uname2);
        
        boolean b = fName.startsWith("A");
        System.out.println(b);
    }
}
