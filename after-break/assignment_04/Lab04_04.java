// challenge 04
import java.util.Scanner;
public class Lab04_04 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String s = getString();     // calls getString method and stores user input
    int n = getNumber();     // calls getNumber method and stores user input
    String result = beads(s, n);     // calls beads method and stores the new string
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
    // uses scanner to ask for the user to enter how long they want the new string to be
    // and returns the user input to the main method
    System.out.print("Enter the desired string length");
    int num = sc.nextInt();
    return num;
  }
  
  public static String beads(String s, int n) {
    int index = 0;
    int count = 0;
    int resultIndex = 0;     // this is used to store the character one-by-one into the array
    char[] resultArray = new char[n];     // array is initialised for storing the letters later
    
    // while loop iterates to create the new string of desired length
    while (count < n) {
      char letter = s.charAt(index);     // each letter is retrieved by going through each index of the string
      resultArray[resultIndex] = letter;     // each letter retrieved are stored in the array
      
      // wrap around to the beginning of the input string if necessary
      index = (index + 1) % s.length(); 
      resultIndex++;     // increment resultIndex
      count++;     // increment count
    }
    
    // converts the character array to a String and returns it to the main method
    return new String(resultArray);
  }
}