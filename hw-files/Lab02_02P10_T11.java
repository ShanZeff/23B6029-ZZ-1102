// Lab 02-2 Part 10
import java.util.Scanner;
public class Lab02_02P10_T11 {
  public static final Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    double distance, speed, timeHour, timeMinute, timeTotal;
    System.out.print("Enter the speed: ");
    speed = scanner.nextDouble();
    
    System.out.print("Enter the total hours traveled: ");
    timeHour = scanner.nextDouble();
    
    System.out.print("Enter the remaining minutes: ");
    timeMinute = scanner.nextDouble();
    
    timeTotal = calcTime(timeHour, timeMinute);
    distance = calcDistance(speed, timeTotal);
    
    System.out.printf("The total distance traveled is %.1f km.%n", distance);
    scanner.close();
  }
  
  public static double calcTime(double myHour, double myMinute) {
    double result = myHour + (myMinute / 60.0);
    return result;
  }
  
  public static double calcDistance(double mySpeed, double myTime) {
    double result = mySpeed * myTime;
    return result;
  }
}