public class Files01 {
  public static void main(String[] args) {
    int[] grades = {1, 2, 3, 4, 5, 6};
    double[][] scores = new double[3][4];
    double[][] sales = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    
    //printy(grades);
    //System.out.println(grades[0]);
    //print(grades);
    printArray(grades);
    //printA2(sales);
    
    for (int i = 0; i < grades.length; i +=2) {
      grades[i]=grades[i]*2;
    }
    printArray(grades);
  }
  
  public static void printy(int[] r) {
    r[0] = r[0]+1;
  }
  
  public static void print(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
  
  public static void printArray(int[] name) {
    System.out.print("{" + name[0]);
    for (int i = 1; i < name.length; i++) {
      System.out.print(", " + name[i]);
    }
    System.out.println("}");
  }
  
  public static void printA2(double[][] arr) {
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 4; col++) {
        System.out.print(arr[row][col]);
        System.out.print("   ");
      }
      System.out.println("");
    }
}
}