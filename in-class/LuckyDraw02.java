import java.util.Scanner;
public class LuckyDraw02 {
  public static void main(String[] args) {
    luckyDraw();
  }
  
  public static boolean luckyDraw() {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Draw first dice: ");
    int dice1, dice2, totalDice;
    dice1 = sc.nextInt();
    System.out.print("Draw second dice: ");
    dice2 = sc.nextInt();
    totalDice = dice1 + dice2;
    
    System.out.println("1st dice: " + dice1 + ",  2nd dice: " + dice2);
    System.out.println("Total dice: " + totalDice);
    
    boolean result;
    if (totalDice == 12) {
      System.out.println("Congrats, You win 1st place!");
      result = true;
      
    } else if (totalDice >= 6 && totalDice <= 11) {
      System.out.println("Congrats, You win 2nd place!");
      result = true;
      
    } else if (totalDice >= 2 && totalDice <= 5) {
      System.out.println("Congrats, You win 3rd place!");
      result = true;
      
    } else {
      System.out.println("Invalid draws. You get the consolation prize, try again.");
      result = false;
      runLuckyDraw(result);
    }
    return result;
  }
  
  public static void runLuckyDraw(boolean result) {
    while (result = false) {
      luckyDraw();
    }
  }
}