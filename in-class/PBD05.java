public class PBD05 {
  public static void main(String[] args) {
    int heightFeet = 5;
    int heightInch = 9;
    double weight = 160;
    
    double heightM = ((heightFeet * 12) + heightInch) * 0.0254;
    double weightKG = weight * 0.45359237;
    double bmi = weightKG / (heightM * heightM);
    
    System.out.println("Your height (feet only): " + heightFeet);
    System.out.println("Your height (inches): " + heightInch);
    System.out.println("Your weight in pounds: " + weight);
    System.out.printf("Your BMI is %.1f%n", bmi);
  }
}
