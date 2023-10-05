import java.util.Scanner;
public class Slide10_06 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String fruit = getString();
    
    countChar(fruit);
    findLastChar(fruit);
    traverseStringBasic(fruit);
    sc.close();
  }
  
  public static String getString() {
    System.out.print("Enter your word: ");
    String word = sc.nextLine();
    return word;
  }
  
  public static void countChar(String fruit) {
    int length = fruit.length();
    System.out.println("length = " + length);
  }
  
  public static void findLastChar(String fruit) {
    int length = fruit.length();
    int last = length - 1;
    char letter = fruit.charAt(last);
    System.out.println("last char = " + letter);
  }
  
  public static void traverseStringBasic(String fruit) {
    int counter = 0;
    while (counter < fruit.length()) {
      char letter = fruit.charAt(counter);
      System.out.println(letter);
      counter = counter + 1;
    }
  }
}