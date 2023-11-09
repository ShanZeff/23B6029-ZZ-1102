// TimeRunner program
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
    
    Time t4 = new Time();
    System.out.println(t4.getHour() + ":" + t4.getMinute() + ":" + t4.getSecond());
    
    boolean result = isAfter(t3, t4);
    System.out.println(result);
    
    Time sum = addTime01(t2, t3);
    sum.print();
    sum = addTime02(t2, t3);
    sum.print();
    increment(t1, 53.2);
  }
  
  public static void printTime(Time t) {
    System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
  }
  
  public static boolean isAfter(Time time1, Time time2) {
    if (time1.getHour() > time2.getHour()) return true;
    if (time1.getHour() < time2.getHour()) return false;
    if (time1.getMinute() > time2.getMinute()) return true;
    if (time1.getMinute() < time2.getMinute()) return false;
    if (time1.getSecond() > time2.getSecond()) return true;
    return false;
  }
  
  public static Time addTime01(Time t1, Time t2) {
    Time sum = new Time();
    sum.setHour(t1.getHour() + t2.getHour());
    sum.setMinute(t1.getMinute() + t2.getMinute());
    sum.setSecond(t1.getSecond() + t2.getSecond());
    
    double tempS = sum.getSecond();
    int tempM = sum.getMinute();
    int tempHr = sum.getHour();
    
    if (tempS >= 60.0) {
      sum.setSecond(tempS -= 60.0);
      sum.setMinute(tempM += 1);
    } if (tempM >= 60) {
      sum.setMinute(tempM -= 60);
      sum.setHour(tempHr += 1);
    } 
    return sum;
  }
  
  public static Time addTime02(Time t1, Time t2) {
    double secs = convertToSeconds(t1) + convertToSeconds(t2);
    return new Time(secs);
  }
  
  public static void increment(Time time, double sec) {
    double tempS = time.getSecond();
    int tempM = time.getMinute();
    int tempHr = time.getHour();
    time.setSecond(tempS += sec);
    
    while (tempS >= 60.0) {
      tempS -= 60.0;
      tempM += 1;
    }
    
    while (tempM >= 60) {
      tempM -= 60;
      tempHr += 1;
    }
  }
  
   public static double convertToSeconds(Time t) {
    int minutes = t.getHour() * 60 + t.getMinute();
    double secs = minutes * 60 + t.getSecond();
    return secs;
  }
}