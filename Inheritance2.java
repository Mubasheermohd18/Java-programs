import java.util.Scanner;
class Vehicle {
    String brand; double speed;
    Vehicle(String brand, double speed){ this.brand=brand; this.speed=speed; }
}
class Car extends Vehicle {
    String fuelType; int seats;
    Car(String brand, double speed, String fuelType, int seats){
        super(brand,speed); this.fuelType=fuelType; this.seats=seats;
    }
    void display(){
        System.out.println("Brand: "+brand+", Speed: "+speed+", Fuel: "+fuelType+", Seats: "+seats);
    }
}
public class Inheritance2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter brand, speed, fuelType, seats: ");
        String b=sc.next(); double sp=sc.nextDouble(); String f=sc.next(); int st=sc.nextInt();
        Car c=new Car(b,sp,f,st);
        c.display();
        sc.close();
    }
}
