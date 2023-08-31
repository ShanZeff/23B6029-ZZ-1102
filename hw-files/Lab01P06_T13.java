public class Lab01P06_T13 {
  public static void main(String[] args) {
    double x, y, formula;
    x = 10.0;
    y = 5.0;
    
    formula = Math.PI * Math.max(4 * y, Math.abs(x - y));
    System.out.printf("The result to this formula is %.2f.%n", formula);
  }
}
