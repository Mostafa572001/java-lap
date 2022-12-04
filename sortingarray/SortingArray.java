
package sortingarray;

import java.util.Scanner;
public class SortingArray {

   static  Scanner in = new Scanner (System.in);

//function to fill array

public static void fill (int[] arr, int x)
{
    for(int i=0;i<x;i++)
    { System.out.print("enter number " +(i+1)+": ");
        arr[i]=in.nextInt();
    }
}
 //function to sort array   

 public static void quick_sort(int [] array, int left, int right)
 {
    if (left < right)
    {
    int q = position(array, left, right);
    quick_sort(array, left, q-1);
    quick_sort(array, q+1, right);
    }
 }
 //function to swap numbers of array 
 
private static int position(int array [], int left, int right) 
{
int i = left - 1;
for (int j = left ; j < right ; j++) {
if (array[j] < array[right]) {
i++;
swap(array, i, j);
}
}

swap(array, i+1, right);
return i+1;
}
// finall sorting
private static void swap(int [] array, int i, int j) {
int temp = array[i];
array[i] = array[j];
array[j] = temp;
}


public static void main(String[] args)
{
       // to fill array from user 
        System.out.print("enter number of array : ");
        int n=in.nextInt();
        int []array=new int[n];
        fill(array,n);
        
        // for print unsorted array
        System.out.print("the unsorted array is : ");
        for (int i = 0 ; i < array.length ; i++)
            {
              System.out.print(array[i]+" ");
            }
              System.out.println();
         
         // calling for sort function
         
        quick_sort(array, 0, array.length - 1);
        
        // for printing unsorted array
        
        System.out.print("the sorted array is :   ");
        for (int i = 0 ; i < array.length ; i++) 
        {
        System.out.print(array[i]+" ");
        }
        
        System.out.println();
  }
   
        
        
    
    
}
