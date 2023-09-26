public class Slide10_06 {
  public static void main(String[] args) {
    String fruit = "strawberry";
    
    countChar(fruit);
    findLastChar(fruit);
    traverseStringBasic(fruit);
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