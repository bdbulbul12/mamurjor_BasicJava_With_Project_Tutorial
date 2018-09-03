
package javabasic;


public class String1Demo {
    public static void main(String[] args) {
        
        String s = "Bulbul Ahmed";
        
        //String s2 = "Bulbul Ahmed";
        
        char[] a ={'a','b','c'};
        System.out.println(a);
        
        String s1 = new String("Bulbul Ahmed");
        
//        System.out.println(s);
//        System.out.println(s1);

        if(s.equals(s1)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
