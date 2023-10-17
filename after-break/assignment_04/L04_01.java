// challenge 01
// prompts and reads string
// string: 3+ words
// output string
// string without: first and last

import java.util.Scanner;
public class L04_01 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    String str = "red orange yellow green blue";
    int firstSpace = str.indexOf(' ');
    int lastSpace = str.lastIndexOf(' ');
    
    if (firstSpace != lastSpace) {
      String newStr = str.substring(firstSpace+1, lastSpace);
      System.out.println(newStr);
    } else {
      System.out.println("Try Again.");
    }
  }
}
