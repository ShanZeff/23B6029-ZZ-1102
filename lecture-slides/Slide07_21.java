import java.util.Scanner;

public class Slide07_21 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double first, second;
    System.out.print("Enter first numeric value: ");
    first = scanner.nextDouble();
    System.out.print("Enter second numeric value: ");
    second = scanner.nextDouble();
    
    if (first > second) {
      double diff = first - second;
      System.out.println(diff);
    } else {
      double diff = second - first;
      System.out.println(diff);
    }
    
    
    int x;
    System.out.print("Enter the numeric value: ");
    x = scanner.nextInt();
    if ((x%2) == 0) {
      System.out.println(x + " is even.");
    } else {
      System.out.println(x + " is odd.");
    }
  }
}