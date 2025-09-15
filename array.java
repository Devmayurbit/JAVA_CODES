import java.util.Scanner;
public class array {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    // System.out.println("enter rows :");
    // int row = sc.nextInt();

    // System.out.println("enter column :");
    // int column = sc.nextInt();

    int arr[][] = new int [3][];

     arr[0] = new int[5];
     arr[1] = new int[2];
     arr[2] = new int[4];


     for(int i=0;i<arr.length;i++)
    {
        for(int j=0; j<arr[i].length ; j++)
        {
           arr[i][j] = sc.nextInt();
        }
    }

    for (int n[] : arr){
        for(int m :n){
            System.out.print(m + " ");
        }
        System.out.println();
    }
    // for(int i=0;i<row;i++)
    // {
    //     for(int j=0; j<column ; j++)
    //     {
    //        arr[i][j] = sc.nextInt();
    //     }
    // }

    // for(int i=0;i<row;i++)
    // {
    //     for(int j=0;j<column;j++)
    //     {
    //        System.out.print(arr[i][j] + " ");
    //     }
    //     System.out.println();
    // }


    // int rows =sc.nextInt();
    // System.out.println("enter columns :");
    // int col =sc.nextInt();

    // int matrix[][]=new int[rows][col];
    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<col;j++){
    //         matrix[i][j]=sc.nextInt();
    //     }

    // }
    // for(int i=0;i<rows;i++){
    //     for(int j=0;j<col;j++){
    //         System.out.print(matrix[i][j]+" ");
    //     }
    //     System.out.println();
    // }
    // int[][] transposedMatrix = new int[col][rows];

    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < col; j++) {
    //         transposedMatrix[j][i] = matrix[i][j];
    //     }
    // }
    // return transposedMatrix;
    
    // int[][] transposedMatrix = transposeMatrix(matrix);

    // System.out.println("\nTransposed Matrix:");
    // printMatrix(transposedMatrix);
} 
}