// W3 Conditional. 
// Lab 2-2 | 2-3. Activity 3/4/5/6.
// Notes: make it flexible as possible

public class Slide07_04 {
  public static void main(String[] args) {
    /*
    int quotient = 7 / 3;        // integer division yields 2
    int remainder = 7 % 3;   // modulus operator yields 1
    System.out.println("quotient: " + quotient);
    System.out.println("remainder: " + remainder);
    
    // is number 7 divisible by 3?
    // check the remiander
    // == double equal for if statements
    if (remainder == 0) {
      System.out.println("Yes, 7 is divisible by 3.");
    }
    
    int quotient = 6 / 3;        // integer division yields 2
    int remainder = 6 % 3;   // modulus operator yields 0
    System.out.println("quotient: " + quotient);
    System.out.println("remainder: " + remainder);
    
    // is number 6 divisible by 3?
    // check the remiander
    // == double equal for if statements
    if (remainder == 0) {
      System.out.println("Yes, 6 is divisible by 3.");
    }
    */
    
    int x = 16;
    int d = 2;
    
    if ((x%d) == 0) {
      System.out.println("Yes, " + x + " is divisible by " + d);
    }
    
    if ((x%d) != 0) {
      System.out.println("No, " + x + " is not divisible by " + d);
    }
  }
}