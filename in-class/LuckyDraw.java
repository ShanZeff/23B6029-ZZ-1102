// You are asked to develop a simple lucky draw system
// Draw a dice one at a time
// 1st Prize winner: total dice = 12
// 2nd Prize winner: total dice = 6 - 11
// 3rd Prize winner: total dice = 2-5
// Consolation -- others 

import java.util.concurrent.ThreadLocalRandom;

public class LuckyDraw{
  public static void main(String[] args) {
    int dice1, dice2, totalDice;
    dice1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    dice2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
    totalDice = dice1 + dice2;
    
    System.out.println("1st dice: " + dice1 + ",  2nd dice: " + dice2);
    System.out.println("Total dice: " + totalDice);
    
    if (totalDice == 12) {
      System.out.println("Congrats, You win 1st place!");
      
    } else if (totalDice >= 6 && totalDice <= 11) {
      System.out.println("Congrats, You win 2nd place!");
      
    } else if (totalDice >= 2 && totalDice <= 5) {
      System.out.println("Congrats, You win 3rd place!");
      
    } else {
      System.out.println("Invalid draws. You get the consolation prize, try again.");
    }
  }
}
