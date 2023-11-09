public class Person {
  // instance
  private String name;
  private int age;
  private char gender;
  
  // constructor
  // this - look at this current object
  public Person() {
    this.name = "";
    this.age = 0;
    this.gender = 'F';
  }
  
  public Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  
  // methods
  public void print() {
    System.out.println(name + ", " + age + ", " + gender);
  }
  
  public void printAll() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Sex: " + gender);
  }
  
  // set() methods
  public void setName(String name) {
    this.name = name;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public void setGender(char gender) {
    this.gender = gender;
  }
  
  public void setAll(String name, int age, char gender) {
    this.name = name; this.age = age; this.gender = gender;
  }
  
  // get() methods
  public String getName() {
    return this.name;
  }
  
  public int getAge() {
    return this.age;
  }
  
  public char getGender() {
    return this.gender;
  }
}