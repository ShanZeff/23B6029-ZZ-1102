public class Slide07_21 {
  public static void main(String[] args) {
    double first, second;
    first = 20.4;
    second = -23.3;
    
    if (first > second) {
      double diff = first - second;
      System.out.println(diff);
    } else {
      double diff = second - first;
      System.out.println(diff);
    }
    
    
    int x = 21;
    if ((x%2) == 0) {
      System.out.println(x + " is even.");
    } else {
      System.out.println(x + " is odd.");
    }
  }
}