package exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int a = 20;
            int b = 0;

            int result = a / b;
            System.out.println(result);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
        finally{
             System.out.println("Ending line ");
        }

       
    }
}
