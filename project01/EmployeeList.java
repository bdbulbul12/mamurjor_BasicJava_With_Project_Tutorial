
package project01;

import java.util.ArrayList;


public class EmployeeList {
    public static void main(String[] args) {
        
        ArrayList<Employee> eList = new ArrayList<>();
        
        //Employee create
        
        Employee e1 = new Employee("Tamim", "Batsman", "B101", 10000);
        Employee e2 = new Employee("Sakib", "Alrounder", "B102", 12000);
        Employee e3 = new Employee("Musfiq", "Batsman", "B101", 13000);
        Employee e4 = new Employee("Mashrafi", "Bowler", "B101", 10000);
        
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);
        eList.add(e4);
        
        for(Employee e : eList){
            
            System.out.println(e.name+" "+e.id+" "+e.designation+" "+e.salary);
        }
        
        
        
    }
}
