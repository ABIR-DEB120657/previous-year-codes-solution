package BasicOfJava.triangle;
class Student{
    String name= "ABIR"; //instace variable
    static String university = "kyau ";//static variable
    void showdetails(){//non static method
        System.out.println("Name : "+name);
        System.out.println("University : "+university);
    }
    static void showuniversity(){//static method
        System.out.println("University : "+university);
    }
}
public class usingobjectstaticmethod {
    public static void main(String[] args) {
        Student s1 = new Student();//object create
        s1.showdetails();//obj method call
        Student.showuniversity();//stat.method call

    }
}
