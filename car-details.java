package BasicOfJava.triangle;
class Mycar{
    String colour;
    String model;
    int speed;
    int fuellevel;
    Mycar(String colour, String model, int speed, int fuellevel){
        this.colour = colour;
        this.model = model;
        this.speed = speed;
        this.fuellevel = fuellevel;
    }
    void start(){
        System.out.println(model+"stated");
    }
    void accelerate(int increment){
        speed = speed + increment;
        System.out.println("speed increase up to "+speed+"kmh");
    }
    void brake(int decrement){
        speed = speed - decrement;
        if (speed<0){
            speed = 0;//khonikar pola gari sala
        }
        System.out.println("speed decrease up to "+speed+"kmh");
    }
    void refuel(int fuel){
        fuellevel = fuellevel+fuel;
        System.out.println("Fuel level = "+fuellevel+"liter");
    }
}
public class car {
    public static void main(String[] args) {
        Mycar c1 = new Mycar("blue","BMW m4",10,4);
        c1.start();
        c1.accelerate(30);
        c1.brake(10);
        c1.refuel(2);
    }
}
