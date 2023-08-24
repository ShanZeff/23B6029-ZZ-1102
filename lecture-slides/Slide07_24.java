// Standard Input
import java.util.Scanner;

public class Slide07_24 {
  public static void main(String[] args) {
    Scanner scanner;    // declaration
    scanner = new Scanner(System.in);  // initialise
    
    // Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your first name: ");
    String firstName = scanner.next();
    System.out.println("Nice to meet you, " + firstName + ".");
    
  }
}