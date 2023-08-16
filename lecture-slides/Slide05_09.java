public class Slide05_09 {
  public static void main(String[] args) {
    // cartesian coordinates of two points
    double x1 =1.0, y1 = 1.0, x2 = 4.0, y2 = 6.0, distance;
    distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    System.out.println("The distance is: " + distance);
    
    // area of a triangle
    double a = 3.0, b = 4.0, c = 5.0, s, area;
    s = (a+b+c) / 2;
    area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
    System.out.println("The area is: " + area);
  }
}