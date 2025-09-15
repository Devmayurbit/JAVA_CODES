import java.util.Random;
import java.util.Scanner;

/**
 * numberguess
 */
public class numberguess {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      int numberToGuess = random.nextInt(100)+ 1;
      int guess = 0;
      int attempts = 0;
      while(guess != numberToGuess){
         System.out.println("enter num to guess");
         guess = scanner.nextInt();
         attempts++;

         if(numberToGuess < guess){
            System.out.println("too high");
         }
         else if(numberToGuess > guess){
            System.out.println("too small");
         }
         else{
            System.out.println("correct you can try in " + attempts+ " attempts");
         }
      }
      scanner.close();
   }
}
// import java.util.Random;
// import java.util.Scanner;

// public class numberguess {
// public static void main(String[] args) {

// Scanner scanner = new Scanner(System.in);
// Random random = new Random();
// int numberToGuess = random.nextInt(100) + 1;

// int guess = 0 ;
// int attempts = 0;
// System.out.println("guess the number between 1 and 100!");

// while(guess != numberToGuess){
//     System.out.println("enter your guess");

//     guess = scanner.nextInt();
//     attempts++;

//     if(guess < numberToGuess){
//         System.out.println("too low!!!");
//  }else if(guess > numberToGuess){
//     System.out.println("too high");
//  }
//  else{
//     System.out.println(" correct you guessed the number in " + attempts + " attempts .");
//  }
// }
// scanner.close();
// }}
