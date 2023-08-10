public class Slide33 {
  public static void main (String[] args) {
    // Slide 33
    int x = 1;
    int y = 5;
    int x2 = 4;
    double z = 0;
    
    /*
    z = ((4*x + y) / x2) - 2*y;
    z = (x + (y*y)) / 0.5;
    z = x + (y*y);
    z = Math.sqrt(x + (y*y));
    double ans1 = Math.pow(y, 2);
    z = Math.sqrt(x + ans1);
    */
    
    z = Math.sqrt(x + Math.pow(y, 2));
    System.out.println(z);
  }
}