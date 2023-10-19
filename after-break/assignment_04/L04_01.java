// challenge 01
import java.util.Scanner;
public class L04_01 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String str = getString();     // calls getString method and stores user input
    printString(str);     // calls printString method and passes the user input into the method
    sc.close();     // closes scanner
  }
  
  public static String getString() {
    // uses scanner to ask for the user to enter the words
    // and returns the user input to the main method
    System.out.print("Please enter three or more words: ");
    String userInput = sc.nextLine();
    return userInput;
  }
  
  public static void printString(String str) {
    // we can determine the start and end of a word by checking for the spaces
    // identify the index where the space ' ' character appears the first time and the last time
    int firstSpace = str.indexOf(' ');
    int lastSpace = str.lastIndexOf(' ');
    
    // if statement is used to make sure that the string has 3 or more words
    if (firstSpace != lastSpace) {
      // this new string starts after the first occurence of the space character
      // and this new string ends before the last occurence of the space character
      String newStr = str.substring(firstSpace+1, lastSpace);
      // the system proceeds to print out the new string which excludes the first and last words
      System.out.println(newStr);
    } else {
      // if firstSpace == lastSpace: this means that the user has only input one or two words
      // here the system does not print out the new string 
      // and displays a "Try Again." message to the user
      System.out.println("Try Again.");
    }
  }
}