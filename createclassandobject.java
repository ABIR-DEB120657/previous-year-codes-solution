package arrarys;
class Human{
    String name;
    double height;
    String sex;
    char surname;
    void setHuman(String name,double height,String sex,char surname ){
        this.name=name;
        this.height=height;
        this.sex = sex;
        this.surname=surname;
    }
    void print(){
        System.out.println("Name: "+name);
        System.out.println("Height: "+height);
        System.out.println("sex :"+sex);
        System.out.println("Surname: "+surname);
    }
}
public class createclassandobjects {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human();
        h1.name = "abir";
        h1.height = 5.6;
        h1.sex = "male";
        h1.surname = 'A';
        h1.print();
        h2.name = "Rafi";
        h2.height = 6.6;
        h2.sex="gay";
        h2.surname = 'R';
        h2.print();
    }
}
