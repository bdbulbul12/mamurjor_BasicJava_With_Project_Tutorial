
package abstraction;


public class Main {
    public static void main(String[] args) {
        
        Bank AtmCard;
        
        AtmCard = new Sakib();
        AtmCard.atmBooth();
        
        AtmCard = new Tamim();
        AtmCard.atmBooth();
    }
}
