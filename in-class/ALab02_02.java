import java.util.Scanner;
public class ALab02_02 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    startThrow();    // game starts
    sc.close();    // close scanner when game ends
  }
  
  // initialise measurements
  public static void startThrow() {
    double b_r = 10.0;    // basket radius in cm
    double b_h = 10.0;    // basket height in cm
    
    // user inputs radius of paper ball & distance they threw the ball
    System.out.print("Enter the paper ball radius: ");
    double pb_r = sc.nextDouble();
    System.out.print("Enter the distance thrown: ");
    double distance = sc.nextDouble();
    
    calculateThrow(pb_r, b_r, b_h, distance);    // proceed to do calculations
  }
  
  // calculating the volume of paper ball & basket
  public static void calculateThrow(double pb_r, double b_r, double b_h, double distance) {
    double distThrow = distance;    // distance the user threw
    double vol_pb = (4.0/3.0) * Math.PI * (pb_r * pb_r * pb_r); 
    double vol_b = Math.PI * (b_r * b_r) * b_h;
    // prints out the volumes after calculations
    System.out.printf("Paper ball volume = %.2f, Basket volume = %.2f%n", vol_pb, vol_b);
    
    shoot(vol_pb, vol_b, distThrow);    // proceed to determine the successfulness of the throw
  }
  
  // checks whether throw was successful or not
  public static void shoot(double vol_pb, double vol_b, double distThrow) {
    boolean result;
    // first, compare paper ball volume with basket volume
    // successful throw: when paper ball volume is less than basket volume
    if (vol_pb < vol_b) {
      // second, compare user's distance thrown
      // successful throw: when user throws for a distance of 100 cm
      if (distThrow == 100) {
        result = true;
      } else {
        result = false;    // unsuccessful throw
      }
    } else {
      result = false;    // unsuccessful throw
    }
    printResult(result);    // proceed to print the result message
  }
  
  // outputs message depending on the success of the throw
  public static void printResult(boolean result) {
    if (result == true) {
      // "successful throw" message
      System.out.println("GOAL!! The paper ball went into the basket.");
    } else {
      // "unsuccessful throw" message
      System.out.println("Warning, the paper ball didn't went in. Try again.");
    }
  }
}