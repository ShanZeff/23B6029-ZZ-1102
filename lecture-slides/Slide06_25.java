public class Slide06_25 {
  // methods with multiple parameters
  public static void printTime(int hour, int minute) {
    hour++;
    System.out.println("in PrintTime: " + hour + ":" + minute);
  }
  
  public static void main(String[] args) {
    int hour = 11;
    int minute = 59;
    System.out.println("hour in main before: " + hour);
    printTime(hour, minute);
    System.out.println("hour in main after: " + hour);
    // printTime(int hour, int minute);
  }
}
