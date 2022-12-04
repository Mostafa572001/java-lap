//nCr = n!/r!(n-r)!
//nPr = n!/(n-r)!
package ncr_npr;

import java.util.Scanner;
public class NCr_nPr {

    
    public static void main(String[] args) {
      int n, r, ncr, npr;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Value of n: ");
      n = s.nextInt();
      System.out.print("Enter the Value of r: ");
      r = s.nextInt();
       System.out.println("*************************** ");
      npr = (fact(n)) / (fact(n-r));
      ncr = npr/fact(r);
      
      System.out.println("nCr of "+n+" and "+r+" = " +ncr);
      System.out.println("nPr of "+n+" and "+r+" = " +npr);
   }
   public static int fact(int num)
   {
      int fact=1;
      for(int i=1; i<=num; i++)
         fact *= i;
      return fact;
    }
    
}
