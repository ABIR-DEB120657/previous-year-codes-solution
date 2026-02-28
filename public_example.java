package BasicOfJava;
class Student{
    String name;
    int age;
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void print(){
        System.out.print("name = " + name+" >> ");
        System.out.println("age = " + age);
    }
}
public class publicccexample {
    public static void main(String[] args) {
        Student s1 = new Student("ABIR",24);
        Student s2 = new Student("RAFI LORE",16);
        s1.print();
        s2.print();
    }
}
