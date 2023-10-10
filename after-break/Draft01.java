public class Draft01 {
  public static void main(String[] args) {
    // 3 or more words
    String str = "neo culture technology";
    String str2 = str.substring(0, 3);
    String str3 = str.substring(4, 11);
    String str4 = str.substring(12);
    
    int index = str.indexOf(' ');
    
    System.out.println(str);
    //System.out.println(str2);
    System.out.println(str3);
    //System.out.println(str4);
    System.out.println(index);
  }
}