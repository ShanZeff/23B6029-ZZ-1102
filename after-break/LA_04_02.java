import java.util.Scanner;
public class LA_04_02 {
  // challenge 03
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String s = getString();
    int n = getNumber();
    tape(s, n);
  }
  
  public static String getString() {
    System.out.print("Enter your word: ");
    String word = sc.nextLine();
    return word;
  }
  
  public static int getNumber() {
    System.out.print("Enter how many times to repeat: ");
    int num = sc.nextInt();
    return num;
  }
  
  public static void tape(String s, int n) {
    int var_counter_1 = 0;
    while (var_counter_1 < s.length()) {
      char letter = s.charAt(var_counter_1);
      int var_counter_2 = 0;
      while (var_counter_2 < n) {
        System.out.print(letter);
        var_counter_2 = var_counter_2 + 1;
      }
      var_counter_1 = var_counter_1 + 1;
    }
  }
}  