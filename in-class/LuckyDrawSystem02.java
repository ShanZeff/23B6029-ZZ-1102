import java.util.Scanner;

public class LuckyDrawSystem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1, dice2;
        
        while (true) {
            System.out.println("Enter two dice rolls (or -1 to exit): ");
            
            // Read the value for the first dice
            dice1 = scanner.nextInt();
            
            // Checking for the exit condition
            if (dice1 == -1) {
                System.out.println("Exiting the lucky draw system.");
                break;
            }
            
            // Read the value for the second dice
            System.out.print("Enter a value for the second dice (numbers are from 1-6):");
            dice2 = scanner.nextInt();
            
            // Calculate the result of the dice rolls
            int result = addition(dice1, dice2);
            
            // Check and display the result and prize
            checkResult(result);
            assignPrize(result);
        }
    }

    // This method calculates the addition of two dice
    public static int addition(int dice1, int dice2) {
        return dice1 + dice2;
    }

    // This method checks and prints the result of the addition
    public static void checkResult(int result) {
        if (result == 12) {
            System.out.println("Yay, you won the first place!");
        } else if (result >= 6 && result <= 11) {
            System.out.println("Yay, you won the second place!");
        } else if (result >= 2 && result <= 5) {
            System.out.println("Yay, you won the third place!");
        } else {
            System.out.println("Unfortunately, luck is not on your side");
        }
    }

    // This method assigns prizes based on the result
    public static void assignPrize(int result) {
        String prize;
        switch (result) {
            case 12:
                prize = "You won $1000";
                break;
            case 11:
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                prize = "You won $500";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
                prize = "You won $250";
                break;
            default:
                prize = "You can try again later.";
                break;
        }
        System.out.println(prize);
    }
}
