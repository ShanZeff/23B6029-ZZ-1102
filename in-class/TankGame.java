public class TankGame {
  public static void main (String[] args) {
    char t1, t2, t3;     // declaration of tank space
    char b_a = 'A';     // declare and initialise Ball A & B
    char b_b = 'B';
    
    // initial state
    t1 = b_a;     // Ball A is stored in tank1
    t2 = '0';
    t3 = b_b;     // Ball B is stored in tank3
    System.out.println("t1:" + t1 + " " + "t2:" + t2 + " " + "t3:" + t3);
    
    // first step
    t1 = '0';
    t2 = b_a;
    t3 = b_b;
    System.out.println("t1:" + t1 + " " + "t2:" + t2 + " " + "t3:" + t3);
    
    // second step
    t1 = b_b;
    t2 = b_a;
    t3 = '0';
    System.out.println("t1:" + t1 + " " + "t2:" + t2 + " " + "t3:" + t3);
    
    // final step
    t1 = b_b;
    t2 = '0';
    t3 = b_a;
    System.out.println("t1:" + t1 + " " + "t2:" + t2 + " " + "t3:" + t3);
  }
}