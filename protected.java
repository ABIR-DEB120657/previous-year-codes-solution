package BasicOfJava;
class Student3 {
    protected String name;
    protected int age;
    void setdata(String name, int age) {
        this.name = name;
        this.age = age;
    }
}class StudentCSE extends Student3{
        void print(){
            System.out.print("name = " + name+" >> ");
            System.out.println("age = " + age);
        }
    }
public class protectedexample {
    public static void main(String[] args) {
        StudentCSE s1 = new StudentCSE();
        StudentCSE s2 = new StudentCSE();
        s1.setdata("abir",21);
        s2.setdata("RAFI MUTMARE",21);
        s1.print();s2.print();
    }
}
