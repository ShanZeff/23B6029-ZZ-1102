import java.util.Scanner;
public class ALab02 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    startThrow();
    sc.close();
  }
  
  public static void startThrow() {
    double pb_r; double b_r; double b_h; double distance;
    System.out.print("Enter the paper ball radius: ");
    pb_r = sc.nextDouble();
    System.out.print("Enter the basket radius: ");
    b_r = sc.nextDouble();
    System.out.print("Enter the basket height: ");
    b_h = sc.nextDouble();
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
      if (distThrow > 90 && distThrow < 110) {
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

// 1) startThrow
// double pb_r : radius paper ball      : 2 cm
// double b_r    : radius basket           : 10 cm
// double b_h   : height basket           : 10 cm
// double distance : distance throw    : 100 cm

// 2) calculateThrow
// double pb_r : radius paper ball
// double b_r    : radius basket
// double b_h   : height basket
// double distance : distance throw
// ** calc volume paper ball & basket
// vol paper ball: v = (4/3) * Math.PI * (pb_r * pb_r)
// vol basket: v = Math.PI * (b_r * b_r) * b_h 

// 3) shoot
// double vol_pb : volume paper ball
// double vol_b   : volume basket
// double distance : distance throw
// ** check if paper ball into basket : yes/no?
// ** volume paper ball < volume basket
// ** within correct distance

// 4) printResult
// boolean result
// goal message : It went in! / Bwoomp :(
