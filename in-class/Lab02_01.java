public class Lab02_01 {
  public static void main (String[] args) {
    // 01. Compound assignment
    int x = 5, y = 2;
    
    x = x + 10;
    System.out.println(x);  // 5+10 = 15
    
    x = 5;
    x += 10;
    System.out.println(x);  // 5+10 = 15
    
    x = 5;
    x = x * 5 + y;
    System.out.println(x);  // (5*5) + 2 = 27
    
    x = 5;
    x *= 5 + y;
    System.out.println(x);  // 5 * (5+2) = 35
  }
}