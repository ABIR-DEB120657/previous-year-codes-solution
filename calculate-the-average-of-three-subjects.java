package arrarys;
import java.util.Scanner;
public class calculatetheaverageofthreesubjects {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("enter the first subject number = ");
        double a = ab.nextDouble();
        System.out.println("enter the second subject number = ");
        Double b = ab.nextDouble();
        System.out.println("enter the third subject number = ");
        double c = ab.nextDouble();
        double average = (a+b+c)/3.0;
        System.out.println("The average of the three subjects is : "+average);

    }
}
