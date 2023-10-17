// challenge 01
// prompts and reads string
// string: 3+ words
// output string
// string without: first and last
public class LA_04_00 {
  public static void main(String[] args) {
    String str = "red orange yellow green blue";
    int num01 = str.indexOf(' ');
    String str1 = str.substring(0, num01);
    System.out.println(num01);
    System.out.println(str1);
    
    int num02 = str.lastIndexOf(' ');
    String str2 = str.substring(num02+1);
    System.out.println(num02);
    System.out.println(str2);
    
    String str3 = str.substring(num01+1, num02);
    System.out.println(str3);
  }
}

