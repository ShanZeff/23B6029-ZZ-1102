import java.util.Scanner;

public class Slide07_34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your test score: ");
    double testScore = scanner.nextDouble();
    grading(testScore);
  }
  
  public static void grading(double score) {
     if (score >= 85) {
      System.out.println("Grade is A");
    } else if (score >= 75) {
      System.out.println("Grade is B");
    } else if (score >= 65) {
      System.out.println("Grade is C");
    } else if (score >= 50) {
      System.out.println("Grade is D");
    } else {
      System.out.println("Grade is N");
    }
  }
}