// Agenda: Week 7 - Strings
// Exc: 10 LabString
// String: not primitive - consists of char
// Char: primitive data type

 // Slide 05
public class Slide10_00 {
  public static void main(String[] args) {
    char ltr = 'd';
    checkChar(ltr);
  }
  
  public static void checkChar(char ltr) {
    if (ltr == 'c') {
      System.out.println(ltr);
    } else {
      System.out.println("character is not c");
    }
  }
}