// challenge 03
import java.util.Scanner;
public class L04_03 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String s = getString();     // calls getString method and stores user input
    int n = getNumber();     // calls getNumber method and stores user input
    String result = tape(s, n);     // calls tape method and stores the new string
    System.out.println("Result: " + result);     // prints out the result which is the new string
    sc.close();     // closes scanner
  }
  
  public static String getString() {
    // uses scanner to ask for the user to enter a word
    // and returns the user input to the main method
    System.out.print("Enter your word: ");
    String userInput = sc.nextLine();
    return userInput;
  }
  
  public static int getNumber() {
    // uses scanner to ask for the user to enter how many times to repeat the characters
    // and returns the user input to the main method
    System.out.print("Enter how many times to repeat: ");
    int num = sc.nextInt();
    return num;
  }
  
  public static String tape(String s, int n) {
    char[] resultArray = new char[s.length() * n];     // array is initialised for storing the characters later
    int counter01 = 0;     // this is used to go through the word character-by-character
    int resultIndex = 0;     // this is used to store the character one-by-one into the array
    
    // loop continues as long as it has not reached the word's length
    while (counter01 < s.length()) {
      // each letter/character are retrieved by going through each index of the string
      char letter = s.charAt(counter01);
      int counter02 = 0;
      
      // loop continues as long as it is not more than the n times the user wanted to repeat
      while (counter02 < n) {
        // each letter/character retrieved are stored in the array
        resultArray[resultIndex] = letter;
        resultIndex++;     // increment resultIndex
        counter02++;     // increment counter02
      }
      counter01++;     // increment counter01
    }
    
    // the array is converted into a string 
    // and returns this new string to the main method
    return new String(resultArray);
  }
}