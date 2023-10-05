// import scanner for user input
import java.util.Scanner;
// import this class which provides methods for generating random numbers
import java.util.concurrent.ThreadLocalRandom;

public class Lab03_Assignment {
  // declare the scanner and it is accessible across multiple classes/methods
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    playGame();    // call playGame to start the Lucky Draw System
    sc.close();    // closes scanner when game ends
  }
  
  public static void playGame() {
    // roll two dice
    int dice1 = rollDice();
    int dice2 = rollDice();
    // calculate the total sum of the two dice
    calcTotal(dice1, dice2);
  }
  
  // drawing dice roll with random number
  // random integer generated are already set to be between 1-6
  // this method eliminates the need to check the validity of the dice roll
  public static int rollDice() {
    // nextInt(int min, int max)
    // minimum value = 1 (inclusive),   maximum value = 7 (exclusive)
    return ThreadLocalRandom.current().nextInt(1, 6 + 1);
  }
  
  // calculate the total sum of the two dice and call determinePrize
  public static void calcTotal(int dice1, int dice2) {
    int diceTotal = dice1 + dice2;
    // print the result of the dice rolls
    System.out.println("1st dice: " + dice1 + ",   2nd dice: " + dice2);
    System.out.println("Total dice score: " + diceTotal);
    determinePrize(diceTotal);
  }
  
  // determine prize based on the diceTotal and call pickPrize
  public static void determinePrize(int diceTotal) {
    int prizeNum = 0;
    // goes through conditional statements and assigns the prize number
    if (diceTotal == 12) {
      prizeNum = 1;
    } else if (diceTotal >= 6 && diceTotal <= 11) {
      prizeNum = 2;
    } else if (diceTotal >= 2 && diceTotal <=5) {
      prizeNum = 3;
    } else {
      System.out.println("You did not win.");
    }
    // call pickPrize to assign and print the prize
    pickPrize(prizeNum);
  }
  
  // assign and print the prize based on prizeNum
  public static void pickPrize(int prizeNum) {
    String prize;
    
    // use a switch statement to assign the prize based on prizeNum
    switch (prizeNum) {
      case 1: prize = "1st Place prize: Sony PlayStation 5 Console";
                  printPrize(prize);
                  break;
      case 2: prize = "2nd Place prize: iPhone 14";
                  printPrize(prize);
                  break;
      case 3: prize = "3rd Place prize: BND100 Hua Ho shopping voucher";
                  printPrize(prize);
                  break;
      default: System.out.println("You did not win.");
                   break;
    }
  }
  
  // prints a congratulatory message and the prize won
  public static void printPrize(String prize) {
    String message = "Congrats, you win the " + prize + "!!";
    System.out.println(message);
    System.out.println();
    // ask the user if they want to play again
    askToPlayAgain();
  }
  
  // ask the user if they want to play again or stop playing
  public static void askToPlayAgain() {
    System.out.println("Would you like to play again?");
    System.out.println("0 : Play again.");
    System.out.println("-1: Stop playing.");
    System.out.print("Enter in the menu number: ");
    int userChoice = sc.nextInt();
    
    // use a switch statement to check for the users choice
    switch (userChoice) {
      case -1: System.out.println("Thanks for playing.");
                   // the system thanks the player and the game ends
                    sc.close();    // closes scanner when game ends
                    break;
      case 0: playGame();
                   // a new round starts if the user wants to play again
                   break;
      default: System.out.println("Error: Wrong menu choice");
                   // ask again if the user provides an invalid choice
                   askToPlayAgain();
                   break;
    }
  }
}