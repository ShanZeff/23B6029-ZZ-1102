public class Time {
  // instance variables
  int hour, minute;
  double second;
  
  // constructor - is use to initialise the instance variable
  // must not have void
  public Time(int h, int m, double s) {
    hour = h;
    minute = m;
    second = s;
  }
  
  // methods
  // get() and set()
  public void print() {
    System.out.println(hour + ":" + minute + ":" + second);
  }
}