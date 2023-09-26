//import java.util.Scanner;
public class Test01_12 {
  //public static final Scanner sc = new Scanner(System.in);
  public static void main(String [] args){
    int counter = 1;
    int factorial = 1;
    for(counter = 1; counter <= 5; counter++) {
      factorial = factorial * counter;
    }
    System.out.print("factorial of 5 is "+ factorial);
  }  
}

