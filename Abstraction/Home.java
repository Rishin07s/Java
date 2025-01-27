package Java.Abstraction;

abstract class Appliance {
    abstract String turnOn();
}

class Fan extends Appliance {
    @Override
    String turnOn() {
        return "The fan is now running.";
    }
}

class Light extends Appliance {
    @Override
    String turnOn() {
        return "The light is now on.";
    }
}

public class Home {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance light = new Light();

        System.out.println(fan.turnOn());
        System.out.println(light.turnOn());
    }
}

