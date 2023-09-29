import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LuckyDraw04 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    playGame();
    sc.close();
  }
  
  public static void playGame() {
    int dice1 = rollDice();
    int dice2 = rollDice();
    calcTotal(dice1, dice2);
  }
  
  // drawing dice with random number
  // random number fetched are already set to be between 1-6
  public static int rollDice() {
    return ThreadLocalRandom.current().nextInt(1, 6 + 1);
  }
  
  // calculates the total sum of the two dices
  public static void calcTotal(int dice1, int dice2) {
    int diceTotal = dice1 + dice2;
    System.out.println("1st dice: " + dice1 + ",   2nd dice: " + dice2);
    System.out.println("Total dice score: " + diceTotal);
    determinePrize(diceTotal);
  }
  
  // determine prize based on the diceTotal
  // goes through conditional and assigns the prize number
  public static void determinePrize(int diceTotal) {
    int prizeNum = 0;
    if (diceTotal == 12) {
      prizeNum = 1;
    } else if (diceTotal >= 6 && diceTotal <= 11) {
      prizeNum = 2;
    } else if (diceTotal >= 2 && diceTotal <=5) {
      prizeNum = 3;
    } else {
      System.out.println("You did not win.");
    }
    pickPrize(prizeNum);
  }
  
  // assigns prize to the prize number
  public static void pickPrize(int prizeNum) {
    String prize;
    
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
  
  // prints congratulatory message and the prize won
  public static void printPrize(String prize) {
    String message = "Congrats, you win the " + prize + "!!";
    System.out.println(message);
    System.out.println();
    askToPlayAgain();
  }
  
  // asks user if they want to play again or stop playing
  public static void askToPlayAgain() {
    System.out.println("Would you like to play again?");
    System.out.println("0 : Play again.");
    System.out.println("-1: Stop playing.");
    System.out.print("Enter in the menu number: ");
    int userChoice = sc.nextInt();
    
    switch (userChoice) {
      case -1: System.out.println("Thanks for playing.");
                    sc.close();
                    break;
      case 0: playGame();
                   break;
      default: System.out.println("Error: Wrong menu choice");
                   askToPlayAgain();
                   break;
    }
  }
}

// draw the two dice
// random number generator
// generator within range 1-6 already
// no need check for dice validity

// calculate the addition

// check the result (addition)
// 12, 6-11, 2-5, other

// 12:    1st Place prize: Sony PlayStation 5 Console
// 6-11: 2nd Place prize: iPhone 14
// 2-5:   3rd Place prize: BND100 Hua Ho shopping voucher

// Congrats, you win the [prize]!!
// Repeat the draw for the next round. The system terminates once the player hits -1
