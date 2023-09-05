import java.util.Scanner;
public class Activity08_01 {
  public static final Scanner sc = new Scanner(System.in);
  public static int counterLimit;
  public static int numLimit;
  
  public static void main(String[] args) {
    getNumber();
  }
  
  public static void getLimit() {
    System.out.print("Enter how many integer numbers to output: ");
    counterLimit = sc.nextInt();
    System.out.print("Enter what number the integer should be less than: ");
    numLimit = sc.nextInt();
  }
  
  public static void getNumber() {
    getLimit();
    int counter = 1;
    while (counter <= counterLimit) {
      System.out.print("Enter a number less than 10: ");
      int userNum = sc.nextInt();
      
      if (userNum < numLimit) {
        ++counter;
        System.out.println(userNum);
        
      } else {
        System.out.println("Try again.");
      }
    }
  }
}
