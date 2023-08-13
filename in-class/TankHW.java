import java.util.Arrays;
public class TankHW {
  public static void main (String [] args) {
    // char[] t1, t2, t3;
    char b_A = 'A';
    char b_B = 'B';
    char b_C = 'C';
    
    // initial state
    char[] t1 = {b_C, b_B, b_A};
    char[] t2 = {'0', '0', '0'};
    char[] t3 = {'0', '0', '0'};
    System.out.println("t1:" + Arrays.toString(t1) + "   " + "t2:" + Arrays.toString(t2) + "   " + "t3:" + Arrays.toString(t3));
  }
}
/*
 * if we're talking abt hanoi tower adjacent
 * [C, B, A]  [0, 0, 0]  [0, 0, 0]
 * [0, B, A]  [0, 0, 0]  [0, 0, C]
 * [0, 0, A]  [0, 0, B]  [0, 0, C]
 * [0, 0, A]  [0, C, B]  [0, 0, 0]
 * [0, 0, 0]  [0, C, B]  [0, 0, A]
 * [0, 0, C]  [0, 0, B]  [0, 0, A]
 * [0, 0, C]  [0, 0, 0]  [0, B, A]
 * [0, 0, 0]  [0, 0, 0]  [C, B, A]
 * 
 * [C, B, A]  [0, 0, 0]  [0, 0, 0]
 * [0, B, A]  [0, 0, C]  [0, 0, 0]
 * [0, 0, A]  [0, B, C]  [0, 0, 0]
 * [0, 0, 0]  [0, B, C]  [0, 0, A]
 * [0, 0, 0]  [0, 0, C]  [0, B, A]
 * [0, 0, 0]  [0, 0, 0]  [C, B, A]
 */
