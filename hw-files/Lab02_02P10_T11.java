//import java.util.Scanner;
public class Lab02_02P10_T11 {
  public static void main(String[] args) {
    double distance, speed, timeHour, timeMinute, timeTotal;
    speed = 83.33;
    timeHour = 1.0;
    timeMinute = 12.0;
    timeTotal = calcTime(timeHour, timeMinute);

    distance = calcDistance(speed, timeTotal);
    System.out.println(formatDecimal(distance));
  }
  
  public static double calcTime(double myHour, double myMinute) {
    double result = myHour + (myMinute / 60.0);
    return result;
  }
  
  public static double calcDistance(double mySpeed, double myTime) {
    double result = mySpeed * myTime;
    return result;
  }
  
  public static String formatDecimal(double value) {
    return String.format("%.2f", value);
  }
}