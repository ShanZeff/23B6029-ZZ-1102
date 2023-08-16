public class Slide04_33 {
  public static void main(String[] args) {
    int x = 1;
    int y = 5;
    int x2 = 4;
    double z = 0;
    
    z = ((4 * x + y) / x2) - 2*y;
    System.out.println(z);
    
    double ans1 = Math.pow(y, 2);
    z = Math.sqrt(x + ans1);
    System.out.println(z);
    
    z = Math.sqrt(x + (y*y));
    System.out.println(z);
    
    z = Math.sqrt(x + Math.pow(y, 2));
    System.out.println(z);
  }
}
