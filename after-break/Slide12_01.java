public class Slide12_01 {
  public static void main(String[] args) {
    /*
    Student [] student = new Student[10];
    student[0] = new Student(12345, "Adil", 3.5);
    student[1] = new Student(67324, "Usman", 3.9);
    */
    
    // Person latte;     - declaration
    // latte = new Person();   - initialisation: calling the constructor
    Person latte = new Person();
    latte.setName("Ms. Latte");
    latte.setAge(20);
    latte.setGender('F');
    
    latte.print();
    latte.printAll();
    
    Person [] person = new Person[20];
    person[0] = new Person();
  }
}


