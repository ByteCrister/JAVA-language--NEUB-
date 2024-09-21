import java.util.*;

class Student {
    String name;
    int id;
    int age;

    public void printStudentInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
        System.out.println("Age : " + this.age);
    }

    // Student(){
    // System.out.println("Constructor Called"); //1st type of constructor -> non
    // parametrize constr
    // }

    // Student(String name, int age){
    // this.age=age;
    // this.name=name; //2nd type of contr -> parametrize constructor
    // }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.id = s.id; // 3rd type of contr -> copy constructor
    }

    Student() {

    }

}

public class Class_OPPS_1 {
    public static void main(String args[]) {

        Student ob1 = new Student();
        // ob1.printStudentInfo();

        ob1.name = "Sadiqul islam shakib";
        ob1.id = 43;
        ob1.age = 22;

        Student ob2 = new Student(ob1);  //calling copy constructor

        ob1.printStudentInfo();
        ob2.printStudentInfo();

    }
}
