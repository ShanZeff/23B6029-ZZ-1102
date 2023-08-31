import java.util.Scanner;
public class Lab02_02P10_T10 {
  public static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    double celsius, fahrenheit;
    System.out.print("Enter the temperature in fahrenheit: ");
    fahrenheit = scanner.nextDouble();
    celsius = convertToCelsius(fahrenheit);
    System.out.printf("The temperature %.1f F is converted into %.1f Celsius.%n", fahrenheit, celsius);
    scanner.close();
  }
  
  public static double convertToCelsius(double myFahrenheit) {
    double result = (5.0 / 9.0) * (myFahrenheit - 32);
    return result;
  }
}