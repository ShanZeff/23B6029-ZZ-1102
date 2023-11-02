// TimeRunner program
import java.util.Scanner;
public class SlideOOP_01 {
  public static void main(String[] args) {
    Time t1 = new Time();
    t1.setHour(11);
    t1.setMinute(8);
    t1.setSecond(3.14159);
    t1.print();
    
    Time t2 = new Time();
    t2.setAll(9, 17, 1.0);
    t2.print();
    
    Time t3 = new Time(2, 54, 2.2);
    printTime(t3);
    
    Time t4 = new Time(8, 7, 4.5);
    System.out.println(t4.hour + ":" + t4.minute + ":" + t4.second);
    
    boolean result = isAfter(t4, t3);
    System.out.println(result);
    
    Time sum = addTime(t2, t3);
    sum.print();
  }
  
  public static void printTime(Time t) {
    System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
  }
  
  public static boolean isAfter(Time time1, Time time2) {
    if (time1.hour > time2.hour) return true;
    if (time1.hour < time2.hour) return false;
    if (time1.minute > time2.minute) return true;
    if (time1.minute < time2.minute) return true;
    if (time1.second > time2.second) return true;
    if (time1.second < time2.second) return true;
    return false;
  }
  
  public static Time addTime(Time t1, Time t2) {
    Time sum = new Time();
    sum.hour = t1.hour + t2.hour;
    sum.minute = t1.minute + t2.minute;
    sum.second = t1.second + t2.second;
    if (sum.second >= 60.0) {
      sum.second -= 60.0;
      sum.minute += 1;
    } if (sum.minute >= 60) {sum.minute -= 60;
      sum.hour += 1;
    }
    return sum;
  }
}