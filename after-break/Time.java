public class Time {
  // instance variables
  int hour, minute;
  double second;
  
  // constructor - is use to initialise the instance variable
  // must not have void
  // instance variable with default values
  public Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
  }
  
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
  
  // set() methods
  public void setHour(int hr) {
    this.hour = hr;
  }
  
  public void setMinute(int min) {
    this.minute = min;
  }
  
  public void setSecond(double sec) {
    this.second = sec;
  }
  
  public void setAll(int hr, int min, double sec) {
    this.hour = hr; this.minute = min; this.second = sec;
  }
  
  // get() methods
  public int getHour() {
    return this.hour;
  }
  
  public int getMinute() {
    return this.minute;
  }
  
  public double getSecond() {
    return this.second;
  }
}