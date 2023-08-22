public class Slide07_17 {
  public static void main(String[] args) {
    // |2.0| = 2.0
    // |-2.0| = 2.0
    double x = -2.0;
    double y = x;
    
    if (y < 0) {
      y = -y;
    }
    System.out.println("The absolute value of " + x + " is " + y);
  }
}