// import java.util.Arrays;
// System.out.println("t1:" + Arrays.toString(t1) + "   " + "t2:" + Arrays.toString(t2) + "   " + "t3:" + Arrays.toString(t3));

public class TankHW {
    public static void main (String [] args) {
        char b_A = 'A';
        char b_B = 'B';
        char b_C = 'C';
        
        // Initial state
        char[] t1 = {b_A, b_B, b_C};
        char[] t2 = {'0', '0', '0'};
        char[] t3 = {'0', '0', '0'};
        
        // Print vertical layout
        for (int i = t1.length - 1; i >= 0; i--) {
            System.out.println("[" + t1[i] + "]\t[" + t2[i] + "]\t[" + t3[i] + "]");
        }
        System.out.println("t1\tt2\tt3");
        System.out.println(" ");
        
        
        // First update
        t1 = new char[]{b_A, b_B, '0'};
        t2 = new char[]{b_C, '0', '0'};
        t3 = new char[]{'0', '0', '0'};
        
        for (int i = t1.length - 1; i >= 0; i--) {
            System.out.println("[" + t1[i] + "]\t[" + t2[i] + "]\t[" + t3[i] + "]");
        }
        System.out.println("t1\tt2\tt3");
        System.out.println(" ");
        
        
        // Second update
        t1 = new char[]{b_A, '0', '0'};
        t2 = new char[]{b_C, b_B, '0'};
        t3 = new char[]{'0', '0', '0'};
        
        for (int i = t1.length - 1; i >= 0; i--) {
            System.out.println("[" + t1[i] + "]\t[" + t2[i] + "]\t[" + t3[i] + "]");
        }
        System.out.println("t1\tt2\tt3");
        System.out.println(" ");
        
        
        // Third update
        t1 = new char[]{'0', '0', '0'};
        t2 = new char[]{b_C, b_B, '0'};
        t3 = new char[]{b_A, '0', '0'};
        
        for (int i = t1.length - 1; i >= 0; i--) {
            System.out.println("[" + t1[i] + "]\t[" + t2[i] + "]\t[" + t3[i] + "]");
        }
        System.out.println("t1\tt2\tt3");
        System.out.println(" ");
        
        
        // Fourth update
        t1 = new char[]{'0', '0', '0'};
        t2 = new char[]{b_C, '0', '0'};
        t3 = new char[]{b_A, b_B, '0'};
        
        for (int i = t1.length - 1; i >= 0; i--) {
            System.out.println("[" + t1[i] + "]\t[" + t2[i] + "]\t[" + t3[i] + "]");
        }
        System.out.println("t1\tt2\tt3");
        System.out.println(" ");
        
        
        // Final update
        t1 = new char[]{'0', '0', '0'};
        t2 = new char[]{'0', '0', '0'};
        t3 = new char[]{b_A, b_B, b_C};
        
        for (int i = t1.length - 1; i >= 0; i--) {
            System.out.println("[" + t1[i] + "]\t[" + t2[i] + "]\t[" + t3[i] + "]");
        }
        System.out.println("t1\tt2\tt3");
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
