import java.util.Scanner;

public class Activity02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double x, y;
    System.out.print("Enter the first numerical value: ");
    x = scanner.nextDouble();
    System.out.print("Enter the second numerical value: ");
    y = scanner.nextDouble();
    // varInput();
    sum(x, y);
    
  }
  /*
  public static void varInput() {
    
  }
  
  public static void average(double myX, double myY) {
    
  }
  
  public static void max(double myX, double myY) {
  }
  
  public static void min(double myX, double myY) {
  }
  */
  public static void sum(double myX, double myY) {
    double result = myX + myY;
    System.out.print(result);
  }
}

// 2 variables input
// average = (x+y) / 2
// maximum = x>y ? y>x ?
// minimum = x<y ? y<x ?
// summation = x+y