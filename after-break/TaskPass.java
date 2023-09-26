// write a method that ask the user for a password
// if the password has the three characters of 'a'
// then it is the correct password

public class TaskPass {
  public static void main(String[] args) {
    String password = "ayam";
    passCheck(password);
    
    password = "extravagant";
    passCheck(password);
  }
  
  public static void passCheck(String password) {
    int counter = 0;
    int countA = 0;
    while (counter < password.length()) {
      char letter = password.charAt(counter);
      if (letter == 'a') {
        countA = countA + 1;
      } 
      counter = counter + 1;
    }
    
    System.out.println("Password: " + password);
    if (countA == 3) {
      System.out.println("This is the correct password.");
    } else {
      System.out.println("This is the wrong password.");
    }
  }
}


