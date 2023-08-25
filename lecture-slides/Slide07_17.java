import java.util.Scanner;

public class Slide07_17 {
  public static void main(String[] args) {
    // |2.0| = 2.0
    // |-2.0| = 2.0
    /*
    double x = -2.0;
    double y = x;
    */
    
    Scanner scanner = new Scanner(System.in);
    double x, y;
    System.out.print("Enter a numeric value: ");
    x = scanner.nextDouble();
    y = x;
    
    if (y < 0) {
      y = -y;
    }
    System.out.println("The absolute value of " + x + " is " + y);
  }
}