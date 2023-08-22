public class Slide07_08 {
  public static void main(String[] args) {
    // and: && . or: ||
    int x = 9;
    boolean y = (x>0 && x<=9);
    System.out.println(y);
    
    if (x>0 && x<=9) {
      System.out.println("x is positive");
    }
    
    if (y) {
      System.out.println("x is positive");
    }
  }
}