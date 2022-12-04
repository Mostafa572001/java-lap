
package removecoma;

import java.util.Scanner;
public class RemoveComa {


    public static void main(String[] args) {
       Scanner in=new Scanner (System.in);
       System.out.print(" enter yor string to remove all comma : ");
       String string = in.nextLine();
       System.out.println("the result string is : " + string.replace(",", ""));
    }
    
}
