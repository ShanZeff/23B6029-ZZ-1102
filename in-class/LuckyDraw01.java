public class LuckyDraw01{
  public static void main(String[] args) {
    int dice1, dice2, totalDice;
    dice1 = 0;
    dice2 = 0;
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
