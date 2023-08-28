/*
public class DLab01_11 {
  public static void main(String[] args) {
    int x = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
    System.out.println("The sum is: " + x);
  }
}

// sum of first ten positive integers
*/
import java.util.Scanner;

public class DLab01_11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter up to what number that you want to sum up: ");
    int n = scanner.nextInt();
    int result = sumUp(n);
    System.out.println("Sum: " + result);
  }
  
  public static int sumUp(int n) {
    if (n==1) {
      return 1;
    } else {
      return sumUp(n-1)+n;
    }
  }
}