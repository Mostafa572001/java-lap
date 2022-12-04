
package inheritance_cir_cly;
import java.util.Scanner;

public class Inheritance_cir_cly {

   
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.println(" enter radius");
          int r=in.nextInt();
         System.out.println(" enter length of clyinder");
            
          int l=in.nextInt();
       Circle c =new Circle();
       Clyinder cl= new Clyinder();
       c.setRad(r);
       cl.setLen(r,l);
        System.out.println("the area of circle = "+c.Area());
        System.out.println("the area of clyinder = "+cl.Area());
    }
    
}
