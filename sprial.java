public class sprial {

     public static void print_sprial(int mat[][])
     {
        int strow = 0 ,
            strcol = 0 , 
            endcol= mat[0].length-1 , 
            endrow = mat.length-1;

            while(strow<=endrow && strcol<=endcol){
                //first row
                for(int j =strcol ; j<=endcol ; j++){
                    System.out.print(mat[strow][j]+" ");
                }
                //last col
                for(int i =strow+1 ; i<=endrow; i++ ){
                    System.out.print(mat[i][endcol]+" "); 
                }
                //last row
                for(int j =endcol-1 ; j>=strcol ; j--){
                    if(strow == endrow){
                        break;
                    }
                    System.out.print(mat[endrow][j]+" ");
                }
                //first col
                for(int i = endrow-1 ; i>=strow+1; i--){
                    if(strcol == endcol){
                        break;
                    }
                    System.out.print(mat[i][strcol]+" " );
                }
                strcol++;
                strow++;
                endcol--;
                endrow--;
            }
            System.out.println();

     }

     public static int diagonal_sum(int matrix[][]){
        int sum = 0;
        for(int i =0;i<matrix.length; i++){
            
            sum += matrix[i][i];

            if(i !=matrix.length-1-i)
            {
                sum += matrix[i][matrix.length-i-1];
            }

        }
        return sum;
     }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4}
                      ,{12,13,14,5},
                        {11,16,15,6},
                        {10,9,8,7}};

       //  print_sprial(matrix);
       System.out.println(diagonal_sum(matrix));
    }
   
}
