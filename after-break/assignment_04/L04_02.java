// challenge 02
import java.util.Scanner;
public class L04_02 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String str = getString();     // calls getString method and stores user input
    checkChar(str);     // calls checkChar method to compare the first and last characters
    sc.close();     // closes scanner
  }
  
  public static String getString() {
    // uses scanner to ask for the user to enter the string that they want to check
    // and returns the user input to the main method
    System.out.print("Enter your string: ");
    String userInput = sc.nextLine();
    return userInput;
  }
  
  public static void checkChar(String str) {
    // this method determines the first and the last characters before doing the comparison
    int length = str.length();     // the length of the string is used to the determine the last index
    int last = (length - 1);

    String char1 = str.substring(0,1);     // the first character is detemined by the following index
    String char2 = str.substring(last);     // the last character is determined by the last index
    System.out.println(char1 + "  " + char2);     // prints out the first and last characters
    
    
    // if statement is used to compare the first and the last characters to check if they're the same
    // the character checking is case sensitive
    // the system outputs appropriate messages depending on the result
    if (char1.equals(char2)) {
      // informs user that the first and the last characters are indeed the same
      System.out.println("The first and the last characters are the same.");
    } else {
      // informs user that the first and the last characters are not the same
      System.out.println("The first and the last characters are not the same.");
    }
  }
}