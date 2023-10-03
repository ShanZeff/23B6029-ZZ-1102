public class Slide10_15 {
  public static void main(String[] args) {
    extractSubString();
    midChar();
    bSat();
    combineChar();
  }
  
  public static void extractSubString() {
    // extract only the last two char of the string
    String name1 = "strawberry";
    if (name1.length() == 1) {
      System.out.println(name1);
    } else {
      String subStr = name1.substring(name1.length()-2);
      System.out.println(subStr);
    }
  }

  public static void midChar() {
    String name1 = "volcano";
    int length = name1.length();
    int middle = (length - 1) / 2;
    char letter = name1.charAt(middle);
    System.out.println("middle char = " + letter);
  }
  
  public static void bSat() {
    String name1 = "satellite";
    if (name1.startsWith("sat")) {
      System.out.println("Yes, it starts with sat");
    } else {
      System.out.println("No, it doesn't starts with sat");
    }
  }
  
  // string: first+middle+last
  public static void combineChar() {
    String name1 = "dinosaur";
    int length = name1.length();
    int middle = (length - 1) / 2;
    int last = (length - 1);
    
    char letterFirst = name1.charAt(0);;
    char letterMiddle = name1.charAt(middle);
    char letterLast = name1.charAt(last);
    
    System.out.println(letterFirst + letterMiddle + letterLast);
    System.out.println("new string = " + letterFirst + letterMiddle + letterLast);
  }
}
