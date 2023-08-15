public class Lab02_02 {
  public static void main (String [] args) {
    // 02. Increment and Decrement
    int x1 = 3;
    x1++;
    System.out.println(x1);
    
    x1 = 3;
    ++x1;
    System.out.println(x1);
    
    // Post-increment
    int n = 8;
    int result = n++;
    System.out.println("n = " + n + ", result = " + result);
    
    double x2 = 2.0, y1; 
    y1 = x2++ * 5.0;
    System.out.println("x = " + x2 + ", y = " + y1);    
    
    // Pre-increment
    n = 8;
    result = ++n;
    System.out.println("n = " + n + ", result = " + result);
    
    double x3 = 2.0, y2; 
    y2 = ++x3 * 5.0;
    System.out.println("x = " + x3 + ", y = " + y2);
    
    // Post-decrement
  }
}