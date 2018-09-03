
package javabasic;


public class Array4TwoDArray {
    public static void main(String[] args) {
        
        int [][] myArray =new int[3][3];
        
        myArray[0][0] = 2;
        myArray[0][1] = 3;
        myArray[0][2] = 4;
        
        myArray[1][0] = 7;
        myArray[1][1] = 9;
        myArray[1][2] = 5;
        
        myArray[2][0] = 1;
        myArray[2][1] = 2;
        myArray[2][2] = 3;
        
        for (int row = 0; row <3; row++) {
            for (int col = 0; col <3; col++) {
                
                System.out.print(" "+myArray[row][col]);
            }
            System.out.println();
        }
        
        
        
       
        
    }
}
