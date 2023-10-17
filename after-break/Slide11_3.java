public class Slide11_3 {
  public static void main(String [] args) {
    double [] grades = new double [9];
    double t = 0;
    for (int x2 = 0; x2 < grades.length; x2++) {
      grades[x2] = t;
      t = t + 2;
    }
    
    for (int x1 = 0; x1 < grades.length; x1++) {
      System.out.println(grades[x1]);
    }
  }
}