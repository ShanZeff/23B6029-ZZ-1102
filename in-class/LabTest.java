import java.util.Scanner;

public class LabTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double radius;
    System.out.printf("Enter value of radius in centimeters "); 
    radius = scanner.nextDouble();
    System.out.println("Successfully enter your number");
    
    double vol = (Math.PI*Math.pow(radius,3)*(4/3));
    System.out.printf("The volume of sphere is " + String.format("%.2f", vol) + " Cubic cm. "); 
    double area = (Math.PI*Math.pow(radius,2)*4);
    System.out.printf("The surface area of sphere is " + String.format("%.2f", area) + " Square cm.");
  }
}
