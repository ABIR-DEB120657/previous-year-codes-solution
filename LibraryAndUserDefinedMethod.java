import java.util.Scanner;
class Calculator{
    int add (int a,int b){//user defind met 1
        return a+b;
    }
    int multiply(int a,int b){//user defnd met 2
        return a*b;
    }
}
public class LibraryAndUserDefinedMethod {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        Calculator c1 = new Calculator();
        System.out.print("Enter 1st number = ");
        int a = ab.nextInt();
        System.out.println(" ");
        System.out.print("Enter 2nd number = ");
        int b = ab.nextInt();
        System.out.println(" ");
        int sum = c1.add(a, b);
        int multiply = c1.multiply(a, b);
        System.out.println("The sum is : " + sum);
        System.out.println("The multiply is : " + multiply);
        System.out.println("square root of first number = " + Math.sqrt(sum));

    }
}
