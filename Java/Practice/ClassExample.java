class StudentInformation {
    
    protected int id, age;
    protected String name, department;

    StudentInformation(int id, int age, String name, String department) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.department = department;
    }

    void show() {
        System.out.println(
                "[ id : " + id + ", age : " + age + ", name : " + name + ", department : " + department + " ]");

    }

    void setValue(int i, int a){
        this.id = i;
        this.age = a;
    }
    /******** Method Overloading Occurs ********/
    void setValue(String n, String d){
        this.name = n;
        this.department = d;
    }

}


/************ inheritance **************/
class setFullInformation extends StudentInformation{

    setFullInformation(int id, int age, String name, String department) {
        super(id, age, name, department);
       
    }

    /************** Method OverRiding ****************/
     void setValue(int i, int a, String n, String d){
        this.id = i;
        this.age = a;
        this.name = n;
        this.department = d;

    }
    
}

public class ClassExample {
    public static void main(String[] args) {

        StudentInformation ob1 = new setFullInformation(43, 22, "Shakib", "CSE");
        ob1.show();
        ob1.setValue(50, 28);
        ob1.show();
        ob1.setValue("Sadiqul", "LLB");
        ob1.show();
        // ob1.setValue(45, 21, "Rakib", "BBA");  error

        System.out.println("\n");
        setFullInformation ob2 = new setFullInformation(43, 22, "Shakib", "CSE");
        ob2.show();
        ob2.setValue(25, 20, "Rakib", "BBA");
        ob2.show();

    }
}
