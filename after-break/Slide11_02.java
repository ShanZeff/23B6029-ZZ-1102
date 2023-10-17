import java.util.Scanner;
public class Slide11_02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double [] rainfall = new double [12];
    double annualAverage = 0.0, sum = 0.0;
    
    for (int i = 0; i < rainfall.length; i++) {
      System.out.print("Enter rainfall value: ");
      rainfall[i] = sc.nextDouble();
    }
  }
}