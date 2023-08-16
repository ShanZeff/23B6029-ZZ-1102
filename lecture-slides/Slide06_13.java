// class: MyClass
// method: myMethod
// should I put the main method at the bottom like usual?

public class Slide06_13 {
  public static void main(String[] args) {
    System.out.println("First Line.");
    // calling a method
    newLine();
    threeLine();
    System.out.println("Second Line.");
    print();
    print();
  }
  
  public static void newLine() {
    System.out.println("");
  }
  
  public static void threeLine() {
    newLine(); newLine(); newLine();
  }
  
  public static void print() {
    System.out.println("Hello, I am in the print method.");
  }
}