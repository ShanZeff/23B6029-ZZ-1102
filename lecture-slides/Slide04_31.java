public class Slide04_31 {
  public static void main(String[] args) {
    // Slide 31
    int a = 2;
    int b = a + 5;
    a = a + 5;
    System.out.println("a: " + a);
    a += 5;     // a = a + 5
    System.out.println("a: " + a);

    
    // Slide 32
    int y = 20, x = 10, z;
    z = x + y;
    
    System.out.println(z);
    System.out.println(y++);
    System.out.println(++y);
    System.out.println(y);
  }
}
