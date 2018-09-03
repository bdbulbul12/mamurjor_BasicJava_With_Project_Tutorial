
package inheritence;

public class Main {
    public static void main(String[] args) {
        
        Son s = new Son();
        s.setCar("Toyota");
        s.setLand(100);
        s.setBike(2);
        
        System.out.println(s.getCar());
        System.out.println(s.getLand());
        System.out.println(s.getBike());
        
        
    }
}
