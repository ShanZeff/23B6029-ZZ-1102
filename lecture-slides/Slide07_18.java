import java.util.Scanner;

public class Slide07_18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testScore;
    System.out.print("Enter your test score: ");
    testScore = scanner.nextInt();
    
    if ((testScore < 50) || (testScore > 100)) {
      System.out.println("You did not pass.");
      System.out.println("Try harder next time.");
      
    } else {
      System.out.println("You did pass.");
      System.out.println("Keep up the good work.");
      System.out.println("");
      
    }
    
    
    int num;
    System.out.print("Enter the numeric value: ");
    num = scanner.nextInt();
    
    if (num < 0) {
      System.out.println(num + " is negative.");
      
    } else {
      System.out.println(num + " is positive.");
      
    }
  }
}