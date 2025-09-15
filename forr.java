import java.util.Scanner;
public class forr {
    public static void main(String[] args) {
        System.out.print(" enter the value of n : ");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //1 pattern
      // for(int i = 0; i<=n; i++){
      //   for(int j = 0 ; j<=i ; j++){
      //     System.out.print('*');
      //   }
      //   System.out.println();
      // }
    

      //2 pattern
      // for(int i = n; i>=0; i--){
      //   for(int j = 1 ; j<=i ; j++){
      //     System.out.print('*');
      //   }
      //   System.out.println();
      // }

      //3 pattern
    //   for(int i = 0; i<=n; i++){
    //     for(int j = 0 ; j<=i ; j++){
    //       System.out.print(j);
    //     }
    //     System.out.println();
    //   }

// 4 pattern

    // for(int i = 0; i<=n; i++){
    //   for(int j = 0 ; j<=i ; j++){
    //     System.out.print(" " + i + " ");
    //   }
    //   System.out.println();
    // }

    // 5 patttern

    // for(int i = 1; i<=n; i++){
    //   for(int j = i ; j>=1 ; j--){
    //     System.out.print( " " + j + " ");
    //   }
    //   System.out.println();
    // }

    //6 pattern
//     char ch = 'A';
//     for(int i = 0; i<=n; i++){
//       for(int j = 0 ; j<=i ; j++){
//         System.out.print("  "+ ch + " ");
// ch++;
//       }
//       System.out.println();
//     }

//7 pattern
// for(int i = 1; i<=n; i++){
//   for(int j = 1 ; j<=n-i ; j++){
//     System.out.print(" ");
//   }
//   for(int j= i ; j>= 1 ; j--){
//     System.out.print("*");
//   }
//   System.out.println();
// }

// 8 pattern
// for(int i = 1; i<=n; i++){
//   for(int j = 1 ; j<=n-i ; j++){
//     System.out.print(" ");
//   }
//   for(int j=i ; j>=1;j--){
//     System.out.print("*");
//   }
//   for (int j=2 ; j<=i ; j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }


// 9  pattern

// for(int i = n; i>=1; i--){
//   for(int j = 1 ; j<=n-i ; j++){
//     System.out.print(" ");
//   }
//   for(int j=i ; j>=1;j--){
// System.out.print  ("^");
//   }
//   System.out.println();
// }


// 10 pattern

// for(int i = 1; i<=n; i++){
//   for(int j = 1 ; j<=n-i ; j++){
//     System.out.print(" ");
//   }
//   for(int j=i ; j>=1;j--){
//     System.out.print("*");
//   }
//   for (int j=2 ; j<=i ; j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }

// for(int i = n; i>=1; i--  ){
//   for(int j = 1 ; j<=n-i ; j++){
//     System.out.print(" ");
//   }
//   for(int j=i ; j>=1;j--){
//     System.out.print("*");
//   }
//   for (int j=2 ; j<=i ; j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }

// 11 pattern

for (int i = 1 ; i<=n ; i++)
{
  for( int  j = 1; j<=i ; j++ )
  {
    System.out.print("*");
  }

  int spaces = 2*n - 2*i ;

  for (int j=1;j<=spaces ;j++)
  {
System.out.print(" ");
  }

  for(int j=i ; j>=1 ;j--)
  {
    System.out.print("*");
  }
  System.out.println();
}

for (int i = n; i>=1 ; i--)
{
  for( int  j = 1; j<=i ; j++ )
  {
    System.out.print("*");
    
  }

  int spaces = 2*n - 2*i ;

  for (int j=1;j<=spaces ;j++)
  {
System.out.print(" ");
  }

  for(int j=1 ; j<=i ;j++)
  {
    System.out.print("*");
  }
  System.out.println();
}
 }
  }
