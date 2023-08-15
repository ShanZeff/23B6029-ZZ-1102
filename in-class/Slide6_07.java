import java.lang.Math;

public class Slide6_07 {
  public static void main (String [] args) {
    double a = 27.5;
    System.out.println(Math.sqrt(17.0));
    
    double result = Math.sqrt(a);
    System.out.println(result);
    
    double angle1 = 1.5;  // in radian
    double height = Math.sin(angle1);
    System.out.println(height);
    
    // degree to radian
    double degrees = 90;
    double angle2 = degrees * 2 * Math.PI / 360.0;
    System.out.println("angle in radian: " + angle2);
    
    int x1 = (int)Math.round(Math.PI * 20.0); // typecasting long to int 
    System.out.println(x1);
    
    // composition
    double x2 = Math.cos(angle2 + Math.PI/2);
    System.out.println(x2);
    
    double x3 = Math.exp(Math.log(10.0));
    System.out.println(x3);
  }
}