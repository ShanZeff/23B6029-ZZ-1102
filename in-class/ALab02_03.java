import java.util.Scanner;
public class ALab02_03 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    double b_r = 10.0;    // basket radius in cm
    double b_h = 10.0;    // basket height in cm
    
    // user inputs radius of paper ball & distance they threw the ball
    System.out.print("Enter the paper ball radius: ");
    double pb_r = sc.nextDouble();
    System.out.print("Enter the distance thrown: ");
    double distance = sc.nextDouble();
    double vol_pb = (4.0/3.0) * Math.PI * (pb_r * pb_r * pb_r);
    double vol_b = Math.PI * (b_r * b_r) * b_h;
    System.out.printf("Paper ball volume = %.2f, Basket volume = %.2f%n", vol_pb, vol_b);
    sc.close();
  }
}