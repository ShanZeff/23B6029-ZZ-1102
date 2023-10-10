import java.util.Scanner;
public class Slide11_2_array{
  public static void main(String [] args){
    double q = 2.1;
    // baru reference, blum jdi array yet
    double [] studentZ;
    
    // declare an array and initialise
    // studentW has the reference to the array
    // studentW (is an object that) is pointing to the array
    double [] studentW = new double [6];
    
    //initialisation
    studentW[0]=30;
    studentW[1]=20;
    studentW[2]=50;
    studentW[3]=40;
    studentW[4]=60;
    studentW[5]=10;
    
    //accessing
    System.out.print(studentW[0] + "  " + studentW[1] + "  " + studentW[2] + " " + studentW[3]+ " " + studentW[4] + " " + studentW[5]);
    
    //loops
    // int i = 0
    // i < less than length/size of array
    // increment i
    for (int i=0;i<studentW.length;i++){
       System.out.println(studentW[i]);
    }
    
    //last element in the array in one line
     System.out.println("last: " +studentW[studentW.length-1]);
     System.out.println("first: " +studentW[0]);

     ///calculate average
     double sum=0, average=0;
     for (int i=0;i<studentW.length;i++){
       //System.out.println(studentW[i]);
       sum=sum+ studentW[i];
    }
    average=sum/studentW.length;
    System.out.println("sum: " +sum);
    System.out.println("average: " +average);
    
    
    //slide 17
    //declaration
    double [] score = new double[5];
    //initialisation
//    score[0]=80;
//    score[1]= 99.9;
//    score[2]=75;
//    score[3]=100;
//    score[4]=85.5;
//    
    Scanner s= new Scanner(System.in);
    for (int j=0; j< score.length;j++){
      System.out.print("Enter new number:");
      score[j]= s.nextDouble();
    }
    //look for the max value
    double max=score[0];  //make the first value as the max
    
    for (int i=1;i<score.length;i++){
      
      if(score[i]>max) {
        max=score[i];
      }
    }
    System.out.println("max" +max);
    
    //to find the difference of max value to each element in the array
    for(int index=0;index<5;index++){
      System.out.println(score[index] +
               "differs from max by" + (max-score[index]));          
      
    }
  }
}