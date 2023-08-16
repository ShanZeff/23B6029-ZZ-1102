public class Slide04_34 {
  public static void main(String[] args) {
    // quadratic equation formula
    double a = 1, b = -5, c =6;
    double root1, root2;
    root1 = ( -b + Math.sqrt(b*b - 4*a*c)) / (2*a);
    root2 = ( -b - Math.sqrt(b*b - 4*a*c)) / (2*a);
    System.out.println("The roots are: " + root1 + ", " + root2);
    
    // area and circumference of circle
    int radius = 3;
    double area, circumference;
    
    area = Math.PI * Math.pow(radius, 2);
    circumference = 2 * Math.PI * radius;
    System.out.println("Area = " + area + " square cm.");
    System.out.println("Circumference = " + circumference + " cm.");
  }
}