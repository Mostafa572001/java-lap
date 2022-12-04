
package area_circumference;

import java.util.Scanner;
public class Circle {
     private double r;

    
    public float setrad (float rad){
        r=rad;
        return rad;
    }
    
    public void getArea()
    {
        
        System.out.println(" the area of circle = " +r*r*3.14);
    }  
    public void getCircu()
    {
        System.out.println( " the circumference of circle = " +2*r*3.14);
    }  
    
}