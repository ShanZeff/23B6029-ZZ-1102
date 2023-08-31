// Lab 01 Part 06
public class Lab01P06_T13 {
  public static void main(String[] args) {
    double x, y, formula;
    x = 10.0;
    y = 5.0;
    
    // Math.PI is a constant value that represents pi
    // Math.max is used to find the maximum value between two numbers
    // Math.abs is used to return the absolute value of a given number
    formula = Math.PI * Math.max(4 * y, Math.abs(x - y));
    
    // appropriate output format of two decimal places
    System.out.printf("The result to this formula is %.2f.%n", formula);
  }
}
