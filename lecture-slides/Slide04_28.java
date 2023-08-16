public class Slide04_28 {
  public static void main(String[] args) {
    int a = 5, b = a, c;
    b = b + 12;
    c = a + b;
    // a + b = c;    invalid
    
    int z;
    z = (int)Math.PI * Math.max(4 * a, Math.abs(a - b));
    System.out.println(c);
    System.out.println(z);
    
    double x = 20.5, y = -16.7, temp;
    temp = x;
    System.out.println("current temp is: " + temp);
    x = y;
    temp = x;
    System.out.println("current temp is: " + temp);
    y = temp;
  }
}