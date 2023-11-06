import java.util.Scanner;
public class Array_Slide15 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    double[] grade = new double[100];
    int gradeCount = 0;
    System.out.print("EnterNextGrade: ");
    double value = kb.nextDouble();
    
    while (value >=0 && gradeCount < 100) {
      grade[gradeCount] = value;
      gradeCount++;
      System.out.println("EnterNextGrade (negative number to to terminate) : ");
      value = kb.nextDouble();
    }
    
    //double average = getAverage(grade, gradeCount);
    //System.out.println();
  }
}