public class Slide04_18 {
  public static void main(String[] args) {
    int hour, minute;
    hour = 11;
    minute = 55;
    
    System.out.print("The current time is ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    minute = 59;
    System.out.println(".");
    
    System.out.println("The current time is " + hour + ":" + minute  + ".");
  }
}
