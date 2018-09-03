
package javabasic;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo {
    public static void main(String[] args) {
        
//        Date date = new Date();
//        
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YY");
//        String d = df.format(date);
//        
//        System.out.println(d);

        LocalTime time = LocalTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String tString= time.format(formatter);
        
        System.out.println(tString);
        
        
    }
}
