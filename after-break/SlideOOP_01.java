import java.util.Scanner;
public class SlideOOP_01 {
  public static void main(String[] args) {
    Time t = new Time(2, 4, 2.2);
    System.out.println(t);
    System.out.println(t.hour + ":" + t.minute + ":" + t.second);
    t.print();
  }
}