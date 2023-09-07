import java.util.Scanner;
public class Slide09_16 {
  public static void main(String[] args) {
    int age;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Your Age (between 0 and 130): ");
    age = sc.nextInt();
    
    // it will execute repetitively until the correct input is given
    while (age < 0 || age > 130) {
      System.out.println("An invalid age was entered. Please try again.");
      System.out.print("Your Age (between 0 and 130): ");
      age = sc.nextInt();
    }
  }
}