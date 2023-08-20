public class DLab0201_01 {
  public static void main(String[] args) {
    double r, s, v;
    r = 1.55511;
    // volume
    v = (4/3) * Math.PI * Math.pow(r, 3);
    // surface area
    s = 4 * Math.PI * Math.pow(r, 2);
    
    System.out.println(v);
    System.out.println(s);
  }
}