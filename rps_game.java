import java.util.Random;
import java.util.Scanner;

public class rps_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String[] choices = {"rock" , "paper" , "scissors"};

    System.out.println("!! --- ROCK - PAPER - SCISSORS GAME --- !!");
    System.out.println("Enter your choice (Rock , Paper , Scissors . Type 'Exit ' to quit .");
   while(true){
    System.out.print("Your choice : ");
    String userchoice = scanner.nextLine();
    if(userchoice.equalsIgnoreCase("Exit")) break;
    int computerIndex = random.nextInt(3);
    String computerChoice = choices[computerIndex];
      System.out.println("Computer Choses : " + computerChoice);
      if(userchoice.equalsIgnoreCase(computerChoice)){
        System.out.println("Shitt !  it's a Tie !!");
      }else if(userchoice.equalsIgnoreCase("rock") && computerChoice.equals("scissors")||(userchoice.equalsIgnoreCase("paper") && computerChoice.equals("rock"))
      ||(userchoice.equalsIgnoreCase("scissors") && computerChoice.equals("paper"))){
        System.out.println(" !! --- You Won --- !!");
      }else{
        System.out.println(" you lose !^-^!");
      }
} 
 scanner.close(); }}
