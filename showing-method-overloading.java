package BasicOfJava.triangle;
class calculator{
    int add (int a,int b){
        return a+b;
    }double add (double a,double b){
        return a+b;
    }int add(int a,int b,int c){
        return a+b+c;
    }int multiply(int a,int b){
        return a*b;
    }int multiply(int a,int b,int c){
        return a*b+c;
    }
}
public class showingmethodoverloading {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println("add 2 interger = "+c1.add(1,2));
        System.out.println("add 3 interger = "+c1.add(3.9,2.8));
        System.out.println("add 3 interger = "+c1.add(3,2,7));
        System.out.println("multiply 2 integer = "+c1.multiply(2,2));
        System.out.println("multiply 3 interger = "+c1.multiply(3,2,7));
    }

}
