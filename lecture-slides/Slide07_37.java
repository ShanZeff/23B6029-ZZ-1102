import java.util.Scanner;

public class Slide07_37 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the numerical value: ");
    int num = scanner.nextInt();
    numCheck(num);
  }
  
  public static void numCheck(int x) {
    if (x > 0) {
      System.out.println("X is positive");
    } else if (x < 0) {
      System.out.println("X is negative");
    } else {
      System.out.println("X is zero");
    }
  }
}