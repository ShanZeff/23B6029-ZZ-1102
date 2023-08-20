public class DLab01_13 {
  public static void main(String[] args) {
    double x, y, formula;
    x = 2.0;
    y = 3.0;
    formula = Math.PI * Math.max(4 * y, Math.abs(x - y));
    
    System.out.println(formula);
  }
}

// calculate and print formula
// initialise (declare and assign): x and y
// explain: Math.PI, Math.max and Math.abs