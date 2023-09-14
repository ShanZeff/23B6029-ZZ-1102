import java.util.Scanner;
public class ALab02_02 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    startThrow();
    sc.close();
  }
  
  public static void startThrow() {
    double pb_r; double b_r; double b_h; double distance;
    b_r = 10.0;
    b_h = 10.0;
    
    System.out.print("Enter the paper ball radius: ");
    pb_r = sc.nextDouble();
    System.out.print("Enter the distance thrown: ");
    distance = sc.nextDouble();
    
    calculateThrow(pb_r, b_r, b_h, distance);
  }
  
  public static void calculateThrow(double pb_r, double b_r, double b_h, double distance) {
    double vol_pb, vol_b;
    double distThrow = distance;
    vol_pb = (4.0/3.0) * Math.PI * (pb_r * pb_r);
    vol_b = Math.PI * (b_r * b_r) * b_h;
    System.out.printf("Paper ball volume = %.2f, Basket volume = %.2f%n", vol_pb, vol_b);
    shoot(vol_pb, vol_b, distThrow);
  }
  
  public static void shoot(double vol_pb, double vol_b, double distThrow) {
    boolean result;
    if (vol_pb < vol_b) {
      if (distThrow == 100) {
        result = true;
      } else {
        result = false;
      }
    } else {
      result = false;
    }
    printResult(result);
  }
  
  public static void printResult(boolean result) {
    if (result == true) {
      System.out.println("Hoooray!! The paper ball went into the basket.");
    } else {
      System.out.println("Booo, the paper ball didn't went in. Try again.");
    }
  }
}