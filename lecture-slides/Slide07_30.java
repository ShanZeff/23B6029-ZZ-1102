// Lab 2-3: Task 7 to 11
// Activity 7
import java.util.Scanner;

public class Slide07_30 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your test score: ");
    double testScore = scanner.nextDouble();
    System.out.print("Enter your age: ");
    int studentAge = scanner.nextInt();
    
    if (testScore >= 50) {
      if (studentAge < 10) {
        System.out.println("You did a great job!");
      } else {
        System.out.println("You did pass.");
      }
    } else {
      System.out.println("You did not pass.");
    }
  }
}