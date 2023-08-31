import java.util.Scanner;
public class Lab02_02P10_T04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1: Find area and perimeter of a rectangle");
    System.out.println("2: Find area and circumference of a circle");
    System.out.print("Enter your menu choice: ");
    int option = scanner.nextInt();
    menuChoice(option);
  }
  
  public static void menuChoice(int myOption) {
    switch (myOption) {
      case 1: calcRectangle();
                   break;
      case 2: calcCircle();
                   break;
      default: System.out.println("Error: Wrong menu choice");
                   break;
    }
  }
  
  public static void calcRectangle() {
    double length, width, area, perimeter;
    length = inputRectangle.length();
    width = inputRectangle.width();
    area = length * width;
    perimeter = (2*length) + (2*width);
    System.out.println("area: " + String.format("%.2f", area));
    System.out.println("perimeter: " + String.format("%.2f", perimeter));
  }
  
  public static double inputRectangle() {
    double length, width, area, perimeter;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length: ");
    length = scanner.nextDouble();
    System.out.print("Enter the width: ");
    width = scanner.nextDouble();
    return length; width;
  }
  
  public static void calcCircle() {
    double radius, area, circumference;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    radius = scanner.nextDouble();
    area = Math.PI*Math.pow(radius, 2.0);
    circumference = 2*Math.PI*radius;
    System.out.println("area: " + String.format("%.2f", area));
    System.out.println("circumference: " + String.format("%.2f", circumference));
  }
}
