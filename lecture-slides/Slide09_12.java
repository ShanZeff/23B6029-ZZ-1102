import java.util.Scanner;
public class Slide09_12 {
  public static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println(1+2+3+4+5+6+7+8+9+10);
    
    System.out.print("Enter up to what number that you want to sum: ");
    int userNum = sc.nextInt();
    int counter =1; int sum = 0;
    
    while (counter <= userNum) {
      sum += counter;
      ++counter;   
    }
    
    System.out.println("The sum is: " + sum);
  }
}