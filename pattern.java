public class pattern {
    public static void hollow_sq(int row , int col){
        for(int i = 1  ; i<=row ; i++){
            for(int j = 1 ; j<=col ; j++){
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void iverted_py(int n){
        for(int i = 1; i<=n ; i++ ){
            for(int j = 1; j <=n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void iverted_num(int n){
        for(int i = 1  ; i <= n ; i++){
            for(int j = 1 ;  j <= (n-i+1) ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_tg(int n){
        int counter=1;
        for(int i = 1; i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static  void zero_one_tg(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);

            for(int j = 1 ;j<=spaces ; j++ ){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>=1 ; i--){
            for(int j = 1 ; j <=i ; j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);

            for(int j = 1 ;j<=spaces ; j++ ){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        for(int i = 1; i<=n ; i++ ){
            for(int j = 1; j <=n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
//or use (2*i)-1;
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n; i>=1; i-- ){
            for(int j = 1; j <=n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }

            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rohumbus(int n){
        for(int  i= 1; i <=n ; i++){
            for(int j=1;j<=n-i;j++){
              System.out.print(" ");
            }
            for(int j= 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollow_rohumbus(int n){
        for(int i = 1 ; i <=n ; i++)
        {
            for(int j = 1 ; j<=n-i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j<=n;j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
    
            }
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
//         hollow_sq(10,8);
//        iverted_py(6);
//        iverted_num(10);
//      floyds_tg(5);
//      zero_one_tg(5);
//      butterfly(6);
//      diamond(5);
//    solid_rohumbus(8);   
//   hollow_rohumbus(7);
}
}
