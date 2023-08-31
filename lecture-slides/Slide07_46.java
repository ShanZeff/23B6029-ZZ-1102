public class Slide07_46 {
  public static void main(String[] args) {
    double x = -3.0;
    printLogarithm(x);
  }
  
  public static void printLogarithm(double x) {
    if (x <= 0.0) {
      System.out.println("Positive numbers only, please.");
      return;
      // System.out.println("testtest");
    }
    
    double result = Math.log(x);
    System.out.println("The log of x is " + result);
  }
}