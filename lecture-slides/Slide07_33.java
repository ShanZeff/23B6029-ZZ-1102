import java.util.Scanner;

public class Slide07_33 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the numerical value: ");
    int x = scanner.nextInt();
    
    if (x == 0) {
      System.out.println("X is zero");
    } else {
      if (x > 0) {
        System.out.println("X is positive");
      } else {
        System.out.println("X is negative");
      }
    }
  }
}