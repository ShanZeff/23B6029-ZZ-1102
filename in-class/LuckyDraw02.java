// not fixed, logic error
import java.util.Scanner;
public class LuckyDraw02 {
  public static void main(String[] args) {
    inputDice();
  }
  
  public static void inputDice() {
    Scanner sc = new Scanner(System.in);
    int dice1, dice2;
    System.out.print("Draw first dice: ");
    dice1 = sc.nextInt();
    System.out.print("Draw second dice: ");
    dice2 = sc.nextInt();
    diceValidity(dice1, dice2);
  }
  
  public static void diceValidity(int dice1, int dice2) {
    int totalDice;
    boolean result = false;
    while (!result) {
      if (dice1 >= 1 && dice1 <= 6 && dice2 >= 1 && dice2 <= 6) {
        totalDice = dice1 + dice2;
          System.out.println("1st dice: " + dice1 + ",  2nd dice: " + dice2);
          System.out.println("Total dice: " + totalDice);
          result = true;
          luckyDraw(totalDice);
      } else {
        System.out.println("Invalid dice values. Enter the dice values again.");
        inputDice();
      }
    }
  }
  
  public static void luckyDraw(int totalDice) {
    if (totalDice == 12) {
      System.out.println("Congrats, You win 1st place!");
      
    } else if (totalDice >= 6 && totalDice <= 11) {
      System.out.println("Congrats, You win 2nd place!");
      
    } else if (totalDice >= 2 && totalDice <= 5) {
      System.out.println("Congrats, You win 3rd place!");
      
    } else {
      System.out.println("Invalid draws. You get the consolation prize, try again.");
      inputDice();
    }
  }
}