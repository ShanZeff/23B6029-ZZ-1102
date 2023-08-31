import java.util.Scanner;
public class Lab02_02P10_T10 {
  public static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    double celsius, fahrenheit;
    System.out.print("Enter the temperature in fahrenheit: ");
    fahrenheit = scanner.nextDouble();
    celsius = calcCelsius(fahrenheit); 
    System.out.println("The temperature " + fahrenheit + " F is converted into " + celsius + " Celsius.");
  }
  
  public static double calcCelsius(double myFahrenheit) {
    double result = (5.0 / 9.0) * (myFahrenheit - 32);
    return result;
  }
}