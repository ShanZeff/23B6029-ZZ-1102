import java.util.Scanner;
public class Lab02_01P08_T01 {
  public static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    double radius, volume, sfArea;
    System.out.print("Enter the radius: ");
    radius = scanner.nextDouble();
    volume = calcVolume(radius);
    sfArea = calcSurfaceArea(radius);
    
    System.out.printf("Volume = %.2f Cubic cm.%n", volume);
    System.out.printf("Surface area = %.2f Square cm.%n", sfArea);
    scanner.close();
  }
  
  public static double calcVolume(double r) {
    double result = (4.0 / 3.0) * Math.PI * (r * r * r);
    return result;
  }
  
  public static double calcSurfaceArea(double r) {
    double result = 4.0 * Math.PI * (r * r);
    return result;
  }
}
