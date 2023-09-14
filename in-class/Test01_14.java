//import java.util.Scanner;
public class Test01_14 {
  //public static final Scanner sc = new Scanner(System.in);
  public static void main(String [] args){
   int x=10;
   displayValue(5);
   displayValue(x+4);
   displayValue(5+5);
   displayValue(5%2+3);
}
public static void displayValue(int num){

    if(num >5) return;
    System.out.println("The value is "+num);
  }
}

// 5 = 5
// x+4 = 14
// 5+5 = 10
// 5%2+3 = 4
