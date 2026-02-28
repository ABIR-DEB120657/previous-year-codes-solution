package arrarys;
class Student{
    String name;
    int age;
    void setStudent(String name,int age){
        this.name=name;
        this.age=age;
    }void print(){
        System.out.print("name:"+name+" ");
        System.out.println("age:"+age);
    }
}
public class characteristicsofobjectt {
    public static void main(String[] args) {
        Student s1 = new Student();  Student s2 = new Student();
        s1.setStudent("Abir",23); s2.setStudent("Rafi",23);
        s1.print(); s2.print();
    }
}
