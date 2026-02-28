package BasicOfJava.triangle;
class car11 {
    String model;
    int speed;
    car11(String model,int speed){
        this.model=model;
        this.speed=speed;
    }
    void show(){
        System.out.println("model = "+model);
        System.out.println("speed = "+speed+"kmh");
    }

}
public class vintagecar {
    public static void main(String[] args) {
        car11 c1 = new car11("BMW M4",300);
        c1.show();
    }
}
