import java.util.Scanner;
public class Lab02_02P10_T04 {
  public static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("1: Find area and perimeter of a rectangle");
    System.out.println("2: Find area and circumference of a circle");
    System.out.print("Enter your menu choice: ");
    int option = scanner.nextInt();
    menuChoice(option);
    scanner.close();
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
    System.out.print("Enter the length: ");
    length = scanner.nextDouble();
    System.out.print("Enter the width: ");
    width = scanner.nextDouble();
    
    area = length * width;
    perimeter = 2 * (length +  width);
    System.out.printf("Area: %.2f square cm, Perimeter: %.2f cm.%n", area, perimeter);
  }
  
  public static void calcCircle() {
    double radius, area, circumference;
    System.out.print("Enter the radius: ");
    radius = scanner.nextDouble();
    
    area = Math.PI * radius * radius;
    circumference = 2 * Math.PI * radius;
    System.out.printf("Area: %.2f square cm, Circumference: %.2f cm.%n", area, circumference);
  }
}
