
package method;


public class Test {
    
    public static void main(String[] args) {
        
        Summation sum = new Summation();
        int result=sum.Add(10, 20);
        System.out.println(result);
        
        int r=sum.Subs(50, 10);
        System.out.println(r);
        
        sum.multiplication();
        
        int overLoad = sum.Add(10, 20, 30);
        System.out.println(overLoad);
    }
}
