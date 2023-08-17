public class Activity01_01 {
  public static void main(String[] args) {
    double x, y, area_Big, area_Small, area_Shaded;
    x = 10.0;
    y = 6.0;
    
    double z, area_Square;
    z = 12.0;
    
    /*
    area_Big = x * x;
    area_Small = y * y;
    area_Shaded = area_Big - area_Small;

    area_Square = z * z;
    area_Shaded = area_Square / 2;
    */
    
    calc_diffArea01(x, y);
    calc_diffArea02(z);
  }
  
  public static void calc_diffArea01(double myX, double myY) {
    double area_Shaded = Math.pow(myX, 2) - Math.pow(myY, 2);
    printArea(area_Shaded);
  }
  
  public static void calc_diffArea02(double myZ) {
    double area_Shaded = Math.pow(myZ, 2) / 2;
    printArea(area_Shaded);
  }
  
  public static void printArea(double myArea) {
    System.out.println("area of shaded region in m: " + myArea);
  }
}
