public class PBD04 {
  public static void main(String[] args) {
    String[] courses = {"English III", "Precalculus", "Music Theory", "Biotechnology", "Technology I", "Latin II", "AP US History", "Business"};
    String[] teachers = {"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer", "Ms. Garcia", "Mrs. Barnett", "Ms. Johannessen", "Mr. James"};
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8};

    // Loop through the arrays and print the table rows
    for (int i = 0; i < courses.length; i++) {
      System.out.printf("| %-4d | %-2s : %s \n", num[i], courses[i], teachers[i]);
    }
  }
}
