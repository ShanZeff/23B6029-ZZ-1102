import java.util.Scanner;
public class Activity08_03 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("1: Output even integers");
    System.out.println("2: Output odd integers");
    System.out.print("Enter your menu choice: ");
    int option = sc.nextInt();
    menuChoice(option);
    sc.close();
  }
  
  public static void menuChoice(int myOption) {
    switch (myOption) {
      case 1: print_Int(0);
                   break;
      case 2: print_Int(-1);
                   break;
      default: System.out.println("Error: Wrong menu choice");
                   break;
    } 
  }
  
  public static void print_Int(int initialNum) {
    int numberPos = initialNum;
    int counter01 = 1;
    int counter02 = 2;
    
    while (counter01 <= 10) {
      numberPos = numberPos + 2;
      System.out.print(numberPos + " ");
      ++counter01;
    } 
    
    System.out.println();
    int numberNeg = numberPos;

    while (counter02 <= 10) {     
      System.out.print(numberNeg + " ");
      numberNeg = numberNeg - 2;
      ++counter02;
  }
}
}
