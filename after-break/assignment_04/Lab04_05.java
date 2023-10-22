// challenge 05
import java.util.Scanner;
public class Lab04_05 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    startCode();     // this method is called to start the password checker code
    sc.close();     // closes scanner
  }
  
  public static void startCode() {
    String str = getString();     // calls getString method and stores user input
    
    // calls the checkPassword method and stores the returned boolean value
    boolean validPassword = checkPassword(str);     
    
    if (validPassword) {
      // password acceptance message is shown when the password satisfies the specification
      System.out.println("Password accepted");
    } else {
      // have user to input password again until password specifications are satisfied
      System.out.println("Password rejected");
      System.out.println("Please re-enter the password.");
      startCode();
    }   
  }
  
  public static String getString() {
    // uses scanner to ask for the user to enter the password
    // and returns the user input to the main method
    System.out.print("Enter your password: ");
    String userInput = sc.nextLine();
    return userInput;
  }
  
  public static boolean checkPassword(String str) {
    // initialising the characters that are in the password specification
    // these variables will be used to compare with the user password
    String lowercase = ".*[a-z].*";
    String uppercase = ".*[A-Z].*";
    String symbol = ".*\\p{Punct}.*";
    String digit = ".*\\d.*";
    
    // checks for valid password length
    if (str.length() >= 8) {
      System.out.println("Yes, this password is 8 characters long or more.");
      // checks for valid password specification for characters
      if (str.matches(lowercase) && str.matches(uppercase) && str.matches(symbol) && str.matches(digit)) {
        return true;
      } else {
        // informs user of incompatible password
        System.out.println("The password must contain digit, symbol, lowercase, and uppercase letters.");
        return false;
      } 
    } else {
      // informs user of incompatible password
      System.out.println("The password must be 8 characters long or more.");
      return false;
    }
  }
}
