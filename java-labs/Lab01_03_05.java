public class Lab01_03_05 {
  public static void main (String[] args) {
    // 3.5 Declaring and Using variables
    int age;
    int numberOfStudents = 20;
    double sum;
    
    // 3.9 Assignment Statements
    int first, second, count = 0;
    double average;
    first = 10;
    second = 20;
    average = (first + second) / 2.0;
    count = count + 1;
    
    int a, b, c; a = b = c = 250;
    // int a = b = c = 250;     // error: cannot find symbol
    System.out.println(average);
    System.out.println(count);
    System.out.println(a + c);
  }
}