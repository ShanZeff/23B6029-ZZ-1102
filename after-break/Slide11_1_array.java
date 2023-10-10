public class Slide11_1_array{
  public static void main (String [] args) {
   // find average of 13 numbers
   // double average= (21+20+14+13+5+31+45+60+12+30)/10;
    
    double average=0, sum=0;
    int collection=10;
    
    double s1=21;
    double s2=20;
    double s3=14;
    double s4=21;
    double s5=20;
    double s6=14;
    double s7=21;
    double s8=20;
    double s9=14;
    double s10=21;
    
    average= (s1+s2+s3+s4+s5+s6+s7+s8+s9+s10)/10;
//    //use the loop
//    for(int i=1;i<=collection;i++){
//      sum=sum+i;
//    }
//    
//    average=sum/collection;
//    
    
    System.out.println(average);
    //check which number greater than average
    if(s1>average){
      System.out.println("s1 is above average");
    }
    
     if(s2>average){
      System.out.println("s2 is above average");
    }
      if(s3>average){
      System.out.println("s3 is above average");
    }
      
     if(s4>average){
      System.out.println("s4 is above average");
    }  
     
     if(s5>average){
      System.out.println("s5 is above average");
     } /*else {
       System.out.println("None are above average");
     } */
  }
}