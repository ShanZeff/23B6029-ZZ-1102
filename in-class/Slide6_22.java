public class Slide6_22 {
  public static void main (String[] args) {
    printTwice("Don't make me say this twice!");
    
    String argument = "Never say never.";
    printTwice(argument);
  }
  
  public static void printTwice(String s) {
    System.out.println(s);
    System.out.println(s);
  }
}