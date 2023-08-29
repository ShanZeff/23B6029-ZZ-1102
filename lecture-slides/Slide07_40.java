import java.util.Scanner;

public class Slide07_40 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the fan speed: ");
    int fanSpeed = scanner.nextInt();
    check_fanSpeed(fanSpeed);
    
    }
  public static void check_fanSpeed(int speed) {
    switch (speed) {
      case 1: System.out.println("That's low");
                   break;
      case 2: System.out.println("That's medium");
                   break;
      case 3: System.out.println("That's high");
                   break;
      default: System.out.println("Speed doesn't exist");
                   break;
  }
  }
}