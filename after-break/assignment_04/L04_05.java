// challenge 05
// #18aDjv@4
public class L04_05 {
  public static void main(String[] args) {
    String str = "#18aDjv@4";
    
    if (str.length() >= 8) {
      System.out.println("Yes, this password is 8 characters long or more.");
    } else {
      System.out.println("Please re-enter the password.");
      System.out.println("The password must be 8 characters long or more.");
    }
    
    String lowercase = ".*[a-z].*";
    String uppercase = ".*[A-Z].*";
    String symbol = ".*\\p{Punct}.*";
    String digit = ".*\\d.*";

    if (str.matches(lowercase) && str.matches(uppercase) && str.matches(symbol) && str.matches(digit)) {
      System.out.println("Password accepted");
    } else {
      System.out.println("Password rejected");
    }
  }
}
