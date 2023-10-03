public class Slide10_12 {
  public static void main(String[] args) {
    String fruit = "banana";
    getIndex(fruit);
    changeCase();
    compareString();
    compareToString();
  }
  
  public static void getIndex(String fruit) {
    int index01 = fruit.indexOf('a');
    int index02 = fruit.indexOf('a', 2);   // start search from index 2 onwards
    System.out.println(index01);
    System.out.println(index02);
  }
  
  public static void changeCase() {
    String name = "Alan Turing";
    String upperName = name.toUpperCase();
    String lowerName = name.toLowerCase();
    System.out.println(upperName + " " + lowerName);
  }
  
  public static void compareString() {
    String name1 = "Alan Turing";
    String name2 = "alan turing";
    
    if (name1.equalsIgnoreCase(name2)) {
      System.out.println("The names are the same.");
    }
  }
  
  public static void compareToString() {
    String name1 = "Alan Turing";
    String name2 = "Ada Lovelace";
    
    int flag = name1.compareTo(name2);
    if (flag == 0) {
      System.out.println("The names are the same.");
    } else if (flag < 0) {
      System.out.println("The name1 comes before name2");
      System.out.println(name1 + " " + name2);
    } else if (flag > 0) {
      System.out.println("The name1 comes after name2");
      System.out.println(name2 + " " + name1);
    }
  }
}
