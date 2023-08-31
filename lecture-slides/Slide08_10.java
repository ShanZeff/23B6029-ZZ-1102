public class Slide08_10 {
  public static void main(String[] args) {
    double dist = distance(1.0, 2.0, 4.0, 6.0);
    System.out.println("distance is " + dist);
  }
  
  public static double distance(double x1, double y1, double x2, double y2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    double dsquared = dx*dx + dy*dy;
    double result = Math.sqrt(dsquared);
    System.out.println("dsquared is " + dsquared);
    return result;
  }
}