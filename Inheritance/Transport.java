package Java.Inheritance;

class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }

    String move() {
        return type + " is moving.";
    }
}

class Car extends Vehicle {
    Car(String type) {
        super(type);
    }

    @Override
    String move() {
        return type + " is driving.";
    }
}

public class Transport {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle");
        Car car = new Car("Car");

        System.out.println(vehicle.move());
        System.out.println(car.move());
    }
}

