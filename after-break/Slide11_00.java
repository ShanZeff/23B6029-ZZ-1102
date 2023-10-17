// we are not recc to use built in packages
// so we can build our programming logic skills
// for array: can't use java.util.Array

public class Slide11_00 {
  // slide 17 - array
  // find the difference of the student marks to the max mark in the test
  
  // collect the marks
  // look for the max marks
  // calculate the difference of max mark to all of the students
  public static void main(String[] args) {
    double [] score1 = new double [5];
    double [] score2 = {80, 99.9, 75, 100, 85};
    //double [] diffScore = new double [5];
    
    double max = score2[0];
    for (int i=1; i < score2.length; i++){
      double value = score2[i];
      if (max < value) {
        max = value;
      }
    }
    System.out.println("max: " + max);
    
    for (int j=0; j < score2.length; j++) {
      double diff = max - score2[j];
      System.out.println(diff);
  }
}
}