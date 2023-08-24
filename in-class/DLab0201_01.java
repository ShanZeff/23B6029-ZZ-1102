public class DLab0201_01 {
  public static void main(String[] args) {
    double r, s, v;
    r = 1.555;
    // volume
    v = (4.0/3.0) * Math.PI * Math.pow(r, 3.0);
    // surface area
    s = 4.0 * Math.PI * Math.pow(r, 2.0);
    
    System.out.println(v);
    System.out.println(s);
  }
}

// 1) r = 1.555, v = 15.75, s/a = 30.386
// 2) r = 1.684, v = 20.00, s/a = 35.63
// 3) r = 1.1577, v = 6.50, s/a = 16.843
// have to round off both to two decimal place