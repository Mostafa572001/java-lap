
package transpose;

import java.util.Scanner ;
public class Transpose {

    static void displayMatrix(int [][] matrix){
        
        
         for (int i =0;i< matrix.length;i++){
              for (int j =0;j< matrix[0].length;j++){
                  System.out.printf(" %6d ", matrix[i][j]);
              }
              System.out.println(" ");
         }         
    }
    static int [][]transposeMatrix(int[][] matrix){
        int[][] transpose =new int [matrix[0].length][matrix.length];
          for (int i =0;i< matrix.length;i++){
              for (int j =0;j < matrix[0].length; j++){
                  transpose[j][i]= matrix[i][j];
              }
          }
          return transpose;
    }
    public static void main(String[] args) {
        int m,n;
        Scanner input= new Scanner (System.in);
        System.out.println(" enter number of rows :");
        m=input.nextInt();
        System.out.println(" enter number of column :");
          n=input.nextInt();
          String [][] originalArray= new String [m][n];
          int[][]matrix =new int [m][n];
          System.out.println(" enter " + (m*n)+" numbers of the matrix  :");
           for (int i =0;i< originalArray.length;i++){
              for (int j =0;j< originalArray[0].length;j++){
                  originalArray[i][j]=input.next();
                  matrix[i][j]=Integer.parseInt(originalArray[i][j]); 
              }
              }
           System.out.println(" the original matrix is :");
           displayMatrix(matrix);
           int[][]matrixTran =transposeMatrix(matrix);     
            System.out.println(" the transpose matrix is :");
           displayMatrix(matrixTran);
    }
    
}
