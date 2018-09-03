
package constructor;


public class Man {
    
    int hand,leg,eye;
    String name;
    
    public Man(){
        System.out.println("Default");
    }
    
    public Man(String n, int h,int l,int e){
        
        this.name=n;
        this.hand=h;
        this.leg=l;
        this.eye=e;
    }
    
    public Man(String n,int h){
         this.name=n;
         this.hand=h;
    }
    
    public  void display(){
        System.out.println("Name is : "+name);
        System.out.println("Hand  is : "+hand);
        System.out.println("Leg is : "+leg);
        System.out.println("Eye is : "+eye);
    }
    
}
