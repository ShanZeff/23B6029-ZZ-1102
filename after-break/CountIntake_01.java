public class CountIntake_01 {
  public static void main(String[] args) {
    meth01();
  }
  
  public static void meth01() {
    // array is floating in the memory
    // studentID is a reference/instance, holding the array to memory in place
    String[] studentID = {"21B6025", "22B6026", "22B6027", "23B6028", "23B6029", "23B6030"};
    meth02(studentID);
  }
  
  public static void meth02(String[] studentID) {
    int count21 = 0; int count22 = 0; int count23 = 0;
    
    for (int i = 0; i < studentID.length; i++) {
      String str = studentID[i].substring(0, 2);
      if (str.equals("21")) {
        count21++;
      } else if (str.equals("22")) {
        count22++;
      } else if (str.equals("23")) {
        count23++;
      } else {
        System.out.println("uhm");
      }
    }
    meth03(count21, count22, count23);
  }
  
  public static void meth03(int count21, int count22, int count23) {
    System.out.println("2021 intake: " + count21);
    System.out.println("2022 intake: " + count22);
    System.out.println("2023 intake: " + count23);
  }
}


// get student ID
// examine first two characters
// identify Stringakes
// count Stringakes