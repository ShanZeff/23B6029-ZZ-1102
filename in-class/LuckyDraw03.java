import java.util.Scanner;

public class LuckyDraw03 {
    public static void main(String[] args) {
        inputDice();
    }

    public static void inputDice() {
        Scanner sc = new Scanner(System.in);
        int dice1, dice2;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Draw first dice: ");
            dice1 = sc.nextInt();
            System.out.print("Draw second dice: ");
            dice2 = sc.nextInt();
            validInput = diceValidity(dice1, dice2);
        }

        sc.close();
    }

    public static boolean diceValidity(int dice1, int dice2) {
        if (dice1 >= 1 && dice1 <= 6 && dice2 >= 1 && dice2 <= 6) {
            int totalDice = dice1 + dice2;
            System.out.println("1st dice: " + dice1 + ",  2nd dice: " + dice2);
            System.out.println("Total dice: " + totalDice);
            luckyDraw(totalDice);
            return true;
        } else {
            System.out.println("Invalid dice values. Enter the dice values again.");
            return false;
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
