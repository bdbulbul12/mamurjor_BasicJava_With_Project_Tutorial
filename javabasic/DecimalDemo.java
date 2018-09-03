
package javabasic;


public class DecimalDemo {
    public static void main(String[] args) {
        
//        String binary = "f";
//        
//        Integer dec = Integer.parseInt(binary, 16);
//        System.out.println(dec);

        int dece = 15;
        
        String bin = Integer.toHexString(dece);
        
        System.out.println(bin);
    }
}
