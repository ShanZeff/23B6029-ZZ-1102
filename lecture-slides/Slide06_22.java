public class Slide06_22 {
  public static void main(String[] args) {
    printTwice("Don't make me say this twice!");
    
    String argument = "Never say never.";
    String quote = "I ain't no easy better think about it twice!";
    
    printTwice(argument);
    printTwice(quote);
    // printTwice(17);    gives error
  }
  
  public static void printTwice(String s) {
    System.out.println(s);
    System.out.println(s);
  }
}