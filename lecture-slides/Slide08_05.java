public class Slide08_05 {
  public static void main(String[] args) {
    // first way
    double radius = 2;
    area(radius);
    System.out.println(String.format("%.2f", area(radius)));
    
    // second way
    double areaCircle = area(3.5);
    System.out.println(String.format("%.2f", areaCircle));
  }
  
  /*
  public static void area(double radius) {
    System.out.println(Math.PI * radius * radius);
  }
  */
  
  public static double area(double radius) {
    double area = Math.PI * radius * radius;
    return area;
  }
}