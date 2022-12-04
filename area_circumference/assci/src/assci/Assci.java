
package assci;

import java.util.Scanner;
public class Assci {

    
    public static void main(String[] args) {
        
// character whose ASCII value to be found  
 Scanner input = new Scanner (System.in);
 System.out.println(" enter charcter to get its Ascii value ");
 
char ch = input.next().charAt(0);
  
// variable that stores the integer value of the character  
int asciivalue = ch;  

System.out.println("The ASCII value of " + ch + " is: " + asciivalue);  

}  
}  
    

