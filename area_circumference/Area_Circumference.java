
package area_circumference;


    
import java.util.Scanner;

public class Area_Circumference {
static Scanner input= new Scanner (System.in);
    
    public static void main(String[] args) {
         
            Triangle tri1= new Triangle();
            tri1.getC();
            System.out.println("******************************");
          tri1.getA();
          System.out.println("******************************");
         Circle c =new Circle();
          System.out.println("enter value of radius .");
         float r=input.nextFloat();
         c.setrad(r);
         c.getArea();

          System.out.println("******************************");
          c.getCircu();
    }
    
}
