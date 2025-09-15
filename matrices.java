import java.util.Scanner;

public class matrices {
    public static boolean find(int matrix[][] , int n){
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] == n){
                System.out.println("find key at index : ( "+i+","+j+")");
                }
            }
            System.out.println("not found ?!!!");
            return false;
        }
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]  = new int[3][3];
        int n = matrix.length ,m = matrix[0].length;
        
        for(int i = 0; i<n ; i++){
           for(int j = 0 ; j<m ; j++){
            matrix[i][j] = sc.nextInt();
           }
        }
        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
             System.out.print(matrix[i][j]  + " ") ;
            }
            System.out.println();
     
        }
        find(matrix, 6);
    }

}
