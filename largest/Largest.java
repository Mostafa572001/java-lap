
package largest;
import java.util.Scanner;

public class Largest {
static Scanner input= new Scanner (System.in);
public static void fill (double[] arr, int x){
    
   
   
    for(int i=0;i<x;i++)
    { System.out.println(" enter number " +(i+1));
        arr[i]=input.nextDouble();
        
    }
}
public static void print (double[] arr){
    System.out.print("*********************************\n");
    System.out.print("the elements of array are :");

    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" , ");

        
    } System.out.print("\n ");
}
public static void large (double[] arr){
    System.out.print("*********************************\n");
   
    double num=0;
    for(int i=0;i<arr.length;i++)
    {
        if(num<arr[i])
            num = arr[i];

        
    }
    System.out.println("Largest element of array = "+ num+"\n"+"************************");
}
   
    public static void main(String[] args) {
        
         System.out.println("enter numbers of array ");
        int  x=input.nextInt();
        double [] array=new double [x];
        fill(array,x);
        print(array);
        
        large(array);
    }
    
}
