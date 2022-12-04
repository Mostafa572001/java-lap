package area_circumference;
import java.util.Scanner;
public class Triangle {
static Scanner input= new Scanner (System.in);
    private int l1, l2, l3, h, A, C;

    public void setL1(int l1) {
        this.l1 = l1;
    }
    public int getL1(int l1) {
        return this.l1;
    }
   public int getL2(int l2) {
        return this.l2;
    }
    
    public void setL2(int l2) {
        this.l2 = l2;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }
   public int getL3(int l3) {
        return this.l3;
    }
    public void setH(int h) {
        this.h = h;
    }

    public void setA(int A) {

        this.A = A;

    }

    public void setC(int C) {
        this.C = C;

    }
      public void getC() {
           
          System.out.println(" enter first length of triangle ");
        l1=input.nextInt();
         System.out.println(" enter second length of triangle ");
        l2=input.nextInt();
         System.out.println(" enter third length of triangle ");
        l3=input.nextInt(); 
      h=l1+l2+l3;
       
        System.out.println(" the circumference of triangle is "+ h);
        
} 
public void getA() {
    
    
       double Area = Math.sqrt(l1+l2+l3/2*(l1+l2+l3/2-l1)*(l1+l2+l3/2-l2)*(l1+l2+l3/2-l3));
     
        System.out.println(" the area of tringle is "+ Area);
}
     
}
