import java.util.Scanner;
public class LA_04_01 {
  // challenge 02
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String name = getString();
    checkChar(name);
    sc.close();
  }
  
  public static String getString() {
    System.out.print("Enter your word: ");
    String word = sc.nextLine();
    return word;
  }
  
  public static void checkChar(String name) {
    int length = name.length();
    int last = (length - 1);

    String str1 = name.substring(0,1);
    String str2 = name.substring(last);
    System.out.println(str1 + "  " + str2);
    
    if (str1.equalsIgnoreCase(str2)) {
      System.out.println("The first and the last characters are the same.");
    } else {
      System.out.println("The first and the last characters are not the same.");
    }
  }
}
  
