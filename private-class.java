package arrarys;

class Student1 {
    private int age;
    void setage(int age) {
        this.age = age;
    }
    void print(){
        System.out.println(" age = "+age );

    }

}
public class classpri_vate {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setage(22);
        s1.print();


    }
}
