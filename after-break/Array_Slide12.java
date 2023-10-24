public class Array_Slide12 {
  public static void main(String[] args) {
    int[] grades = {5, 7, 6, 8, 10};
    System.out.print("Grades before doubling: ");
    printArray(grades);
    doubleArray(grades);
    System.out.print("Grades after doubling: ");
    printArray(grades);
  }
  
  public static void printArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
  
  public static void doubleArray(int[] a) {
    for (int i = 0; i < a.length; i++) {
      a[i] = a[i] * 2;
    }
  }
} 