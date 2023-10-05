public class Draft02 {
  public static void main(String[] args) {
    String name = "cool";
    int cnt = 0;
    int count = 0;
    while (cnt < 10) {
      while (count < name.length()) {
        char letter = name.charAt(count);
        System.out.print(letter);
        count = count + 1;
        cnt = cnt + 1;
      }
    }
  }
  
}