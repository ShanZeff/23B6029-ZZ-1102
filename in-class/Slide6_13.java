// class: MyClass
// method: myMethod

public class Slide6_13 {
  public static void main (String[] args) {
    System.out.println("First Line.");
    // calling a method
    newLine();
    threeLine();
    System.out.println("Second Line.");
  }
  
  public static void newLine() {
    System.out.println("");
  }
  
  public static void threeLine() {
    newLine(); newLine(); newLine();
  }
}