public class Student {
  // instance
  private int id;
  private String name;
  private double gpa;
  
  // constructor
  // this - look at this current object
  public Student() {
    this.id = 0;
    this.name = "";
    this.gpa = 0.0;
  }
  
  public Student(int id, String name, double gpa) {
    this.id = id;
    this.name = name;
    this.gpa = gpa;
  }
  
  // methods
  public void print() {
    System.out.println(id + ", " + name + ", " + gpa);
  }
  
  public void printAll() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("GPA: " + gpa);
  }
  
  // set() methods
  public void setID(int id) {
    this.id = id;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setGPA(double gpa) {
    this.gpa = gpa;
  }
  
  public void setAll(int id, String name, double gpa) {
    this.id = id; this.name = name; this.gpa = gpa;
  }
  
  // get() methods
  public int getID() {
    return this.id;
  }
  
  public String getName() {
    return this.name;
  }
  
  public double getGPA() {
    return this.gpa;
  }
}