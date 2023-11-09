import java.util.Scanner;
public class Slide12_01 {
  public static final Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    Student [] student = new Student[10];
    student[0] = new Student(12345, "Adil", 3.5);
    student[1] = new Student(67324, "Usman", 3.9);
    student[1].print();
    
    // Person latte;     - declaration
    // latte = new Person();   - initialisation: calling the constructor
    Person latte = new Person();
    latte.setName("Ms. Latte");
    latte.setAge(20);
    latte.setGender('F');
    
    latte.print();
    //latte.printAll();
    System.out.println("");
    
    Person [] person = new Person[3];
    person[0] = new Person();
    person[0].printAll();
    
    String name, str_gender;
    int age;
    char gender;
    
    for (int i = 0; i < person.length; i++) {
      System.out.print("Enter name: "); name = sc.next();
      System.out.print("Enter age: "); age = sc.nextInt();
      System.out.print("Enter gender: "); str_gender = sc.next();
      gender = str_gender.charAt(0);
      
      person[i] = new Person();
      person[i].setName(name);
      person[i].setAge(age);
      person[i].setGender(gender);
    }
  }
}


